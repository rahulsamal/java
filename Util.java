package com.util.ekart;

import java.util.Scanner;

public class Util {
	private static Scanner scanner=null;

	public static Scanner getScanner() {

		if (null == scanner)
			return new Scanner(System.in);
		else
			return scanner;
	}
}
