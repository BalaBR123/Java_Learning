package org.java.basics;

import java.util.Scanner;

public class Calculator {

	static int first, second, result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cl = new Calculator();
		System.out.println(cl instanceof Calculator);
		cl.Calculator2();
		System.out.println("Enter the number");
		first = sc.nextInt();
		second = sc.nextInt();
		// To use the sqrt function
				Calculator obj = new Calculator();
		int total = obj.add();
		System.out.println(total);
		int total2 = obj.sub();
		System.out.println(total2);
		int total3 = obj.multi();
		System.out.println(total3);
		int total4 = obj.divi();
		System.out.println(total4);
		cl.Calculator();
		
	}

	private int divi() {
		result = first / second;
		return result;
	}

	private int sub() {
		result = first - second;
		return result;
	}

	private int multi() {
		result = first * second;
		return result;
	}

	private int add() {
		result = first + second;
		return result;
	}

	public void Calculator() {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("Addition of two numbers:" + c);
		c = a * b;
		System.out.println("Multiplaction of two numbers:" + c);
		c = a - b;
		System.out.println("Subtraction of two numbers:" + c);
		c = a / b;
		System.out.println("Divided of two numbers:" + c);
	}

	public void Calculator2() {

		int a, b, c, ch;
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multplication");
		System.out.println("4.Division");

		System.out.println("Enter your choice :");

		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		System.out.println("Enter two numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		switch (ch) {

		case 1:
			c = a + b;
			System.out.println("1.Addition: " + c);
		break;

		case 2:
			c = a - b;
			System.out.println("2.Subtraction: " + c);
			break;

		case 3:
			c = a * b;
			System.out.println("3.Multiplication: " + c);
			break;
		case 4:
			c = a / b;
			System.out.println("4.Division: " + c);
			break;
		default:

			System.out.println("Invalid selection");
			break;
		}
	}
}
