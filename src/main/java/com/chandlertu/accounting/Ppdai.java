package com.chandlertu.accounting;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Ppdai {

	public void toCsv(Path txt, Path csv) {
		try {
			List<String> lines = Files.readAllLines(txt);
			List<String> newLines = new ArrayList<String>();
			for (String line : lines) {
				line = line.replaceAll("¥", "").replaceAll(",", "").replaceAll("\t", ",").replaceAll(",,", ",");
				newLines.add(line);
			}
			Files.write(csv, newLines, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
