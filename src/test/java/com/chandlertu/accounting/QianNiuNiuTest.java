package com.chandlertu.accounting;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class QianNiuNiuTest {

	@Test
	public void test() throws URISyntaxException {
		Path parent = Paths.get(getClass().getResource("").toURI());
		Path txt = parent.resolve("«Æ≈£≈£≥‰÷µ.txt");
		Path csv = parent.resolve("«Æ≈£≈£≥‰÷µ.csv");

		QianNiuNiu qianNiuNiu = new QianNiuNiu();
		qianNiuNiu.toCsv(txt, csv);
		System.out.println(csv);

		txt = parent.resolve("«Æ≈£≈£Ã·œ÷.txt");
		csv = parent.resolve("«Æ≈£≈£Ã·œ÷.csv");
		qianNiuNiu.toCsv(txt, csv);
		System.out.println(csv);
	}

}
