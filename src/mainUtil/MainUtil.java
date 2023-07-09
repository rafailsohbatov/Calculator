package mainUtil;

import java.util.Scanner;

import calculators.IphoneCalculator;
import calculators.NokiaCalculator;

public class MainUtil {
	Scanner scan;

	public MainUtil(Scanner scan) {
		this.scan = scan;
	}

	public double iphoneCalc() {
		System.out.println("Num1 - i daxil edin;");
		double num1 = scan.nextInt();
		System.out.println("1.Sum\n2.Difference\n3.Product\n4.Division\n5.Module");
		int option = scan.nextInt();
		IphoneCalculator ip = new IphoneCalculator();
		double result = 0;
		double num2;
		switch (option) {
		case 1:
			System.out.println("Num2 - i daxil edin;");
			num2 = scan.nextInt();
			result = ip.sum(num1, num2);
			break;
		case 2:
			System.out.println("Num2 - i daxil edin;");
			num2 = scan.nextInt();
			result = ip.difference(num1, num2);
			break;
		case 3:
			System.out.println("Num2 - i daxil edin;");
			num2 = scan.nextInt();
			result = ip.product(num1, num2);
			break;
		case 4:
			System.out.println("Num2 - i daxil edin;");
			num2 = scan.nextInt();
			result = ip.division(num1, num2);
			break;
		case 5:
			result = ip.module(num1);
		default:
			System.out.println("Bele bir metod yoxdur");
		}
		return result;
	}

	public double nokiaCalc() {
		System.out.println("Num1 - i daxil edin;");
		double num1 = scan.nextInt();
		System.out.println("1.Sum\n2.Difference\n3.Product\n4.Division\n5.Pow");
		int option = scan.nextInt();
		NokiaCalculator nc = new NokiaCalculator();
		double result = 0;
		System.out.println("Num2 - i daxil edin;");
		double num2 = scan.nextInt();
		switch (option) {
		case 1:
			result = nc.sum(num1, num2);
			break;
		case 2:
			result = nc.difference(num1, num2);
			break;
		case 3:
			result = nc.product(num1, num2);
			break;
		case 4:
			result = nc.division(num1, num2);
			break;
		case 5:
			result = nc.pow(num1, (int) num2);
			break;
		default:
			System.out.println("Bele bir metod yoxdur");
		}
		return result;
	}
}
