package calculators;

public class Calculator {

	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public double difference(double num1, double num2) {
		return num1 - num2;
	}

	public double product(double num1, double num2) {
		return num1 * num2;
	}

	public double division(double num1, double num2) throws ArithmeticException {
		if (num2 == 0) {
			throw new ArithmeticException();
		}
		return num1 / num2;
	}
}
