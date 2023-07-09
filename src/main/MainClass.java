package main;

import java.util.Scanner;

import mainUtil.MainUtil;

public class MainClass {
	public static void main(String[] args) {
		try {

			Scanner scan = new Scanner(System.in);

			System.out.println("1.Iphone Calculator\n2.Nokia Calculator");
			int option = scan.nextInt();
			MainUtil mainUtil = new MainUtil(scan);
			double result;
			switch (option) {
			case 1:
				result = mainUtil.iphoneCalc();
				System.out.println("Result= " + result);
				break;
			case 2:
				result = mainUtil.nokiaCalc();
				System.out.println("Result= " + result);
				break;
			default:
				System.out.println("Bele bir secim yoxdur");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
