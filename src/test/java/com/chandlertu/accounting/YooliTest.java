package com.chandlertu.accounting;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class YooliTest {

	@Test
	public void test() throws URISyntaxException {
		Path parent = Paths.get("data");
		Path txt = parent.resolve("有利网充值.txt");
		Path csv = parent.resolve("有利网充值.csv");

		Yooli yooli = new Yooli();
		yooli.toCsv(txt, csv);
		System.out.println(csv);

		txt = parent.resolve("有利网提现.txt");
		csv = parent.resolve("有利网提现.csv");
		yooli.toCsv(txt, csv);
		System.out.println(csv);
	}

}
