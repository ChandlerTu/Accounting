package com.chandlertu.accounting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Yooli {

	public void toCsv(Path txt, Path csv) {
		try {
			List<String> lines = Files.readAllLines(txt);
			StringBuilder sb = new StringBuilder();
			sb.append("时间,交易类型,流水号,对方,金额(?),可用余额(?)");
			for (String line : lines) {
				if (line.split("\\.").length == 3) {
					sb.append("\n");
				} else {
					if (!line.isEmpty()) {
						sb.append(line.replaceAll(",", "").trim());
						sb.append(",");
					}
				}
			}

			System.out.println(sb);
			Files.write(csv, sb.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
