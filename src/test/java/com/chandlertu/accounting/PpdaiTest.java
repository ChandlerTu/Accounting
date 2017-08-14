package com.chandlertu.accounting;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class PpdaiTest {

	@Test
	public void test() throws URISyntaxException {
		Path parent = Paths.get(getClass().getResource("").toURI());
		Path txt = parent.resolve("едед╢ШЁДж╣.txt");
		Path csv = parent.resolve("едед╢ШЁДж╣.csv");

		Ppdai ppdai = new Ppdai();
		ppdai.toCsv(txt, csv);
		System.out.println(csv);

		txt = parent.resolve("едед╢ШлАож.txt");
		csv = parent.resolve("едед╢ШлАож.csv");
		ppdai.toCsv(txt, csv);
		System.out.println(csv);
	}

}
