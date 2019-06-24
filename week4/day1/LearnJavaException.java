package week4.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnJavaException {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int input = 10;
		try {
			input = sc.nextInt();
		} catch (InputMismatchException e1) {
			System.err.println("Input should be only numbers");
		}
		try {
			System.out.println(input/0);
		} catch (Exception e) {
			System.err.println("Cannot divisible by 0");
		}
		System.out.println("This is new line");
		sc.close();
	}

}
