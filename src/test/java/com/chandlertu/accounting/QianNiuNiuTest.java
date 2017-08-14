package com.chandlertu.accounting;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class QianNiuNiuTest {

	@Test
	public void test() throws URISyntaxException {
		Path parent = Paths.get(getClass().getResource("").toURI());
		Path txt = parent.resolve("Ǯţţ��ֵ.txt");
		Path csv = parent.resolve("Ǯţţ��ֵ.csv");

		QianNiuNiu qianNiuNiu = new QianNiuNiu();
		qianNiuNiu.toCsv(txt, csv);
		System.out.println(csv);

		txt = parent.resolve("Ǯţţ����.txt");
		csv = parent.resolve("Ǯţţ����.csv");
		qianNiuNiu.toCsv(txt, csv);
		System.out.println(csv);
	}

}
