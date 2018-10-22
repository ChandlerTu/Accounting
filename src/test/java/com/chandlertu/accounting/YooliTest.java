package com.chandlertu.accounting;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class YooliTest {

	@Test
	public void test() throws URISyntaxException {
		Path parent = Paths.get("data");
		Path txt = parent.resolve("��������ֵ.txt");
		Path csv = parent.resolve("��������ֵ.csv");

		Yooli yooli = new Yooli();
		yooli.toCsv(txt, csv);
		System.out.println(csv);

		txt = parent.resolve("����������.txt");
		csv = parent.resolve("����������.csv");
		yooli.toCsv(txt, csv);
		System.out.println(csv);
	}

}
