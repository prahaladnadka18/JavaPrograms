package recursionbasics;

import java.util.Scanner;

public class DisplayNumbers {

	static void displayNum(int n) {

		if(n>1) {
			displayNum(n-1);
		}

		System.out.println(n);


	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		displayNum(n);

	}

}

