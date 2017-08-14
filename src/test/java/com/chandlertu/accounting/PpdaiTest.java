package com.chandlertu.accounting;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class PpdaiTest {

	@Test
	public void test() throws URISyntaxException {
		Path parent = Paths.get(getClass().getResource("").toURI());
		Path txt = parent.resolve("���Ĵ���ֵ.txt");
		Path csv = parent.resolve("���Ĵ���ֵ.csv");

		Ppdai ppdai = new Ppdai();
		ppdai.toCsv(txt, csv);
		System.out.println(csv);

		txt = parent.resolve("���Ĵ�����.txt");
		csv = parent.resolve("���Ĵ�����.csv");
		ppdai.toCsv(txt, csv);
		System.out.println(csv);
	}

}
