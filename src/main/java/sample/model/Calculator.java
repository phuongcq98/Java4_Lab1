package sample.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Calculator implements Serializable {

	public double addition(int a, int b) {
		return a + b;
	}

	public double subtraction(int a, int b) {
		return a - b;
	}

	public double multiplication(int a, int b) {
		return a * b;
	}

	public double division(int a, int b) {
		return a / b;
	}
}
