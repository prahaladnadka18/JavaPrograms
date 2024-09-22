package recursionbasics;

import java.util.Scanner;

public class NumberOfDigits {

	static int sum(int n) {
		if(n>=-9&&n<=9) {
			return 1;
		}

		return 1+sum(n/10);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		System.out.println(sum(n));


	}

}
