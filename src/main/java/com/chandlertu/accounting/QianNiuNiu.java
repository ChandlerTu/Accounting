package com.chandlertu.accounting;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QianNiuNiu {

	public void toCsv(Path txt, Path csv) {
		try {
			byte[] bytes = Files.readAllBytes(txt);
			String string = new String(bytes, StandardCharsets.UTF_8);
			string = string.replaceAll(",", "").replaceAll("\\+", ",").replaceAll("提现-", "提现,").replaceAll(System.getProperty("line.separator"),
					",");

			List<String> lines = new ArrayList<String>();
			int index = string.indexOf("状态") + "状态".length();
			String title = string.substring(0, index);
			lines.add(title);

			string = string.substring(index + 1, string.length());
			String[] array = string.split("交易完成,");
			for (String s : array) {
				int i = s.indexOf(".");
				if (i > 0) {
					lines.add(s.substring(0, i + 3) + "," + s.substring(i + 3) + ",交易完成");
				} else {
					lines.add(s + ",交易完成");
				}
			}

			Files.write(csv, lines, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
