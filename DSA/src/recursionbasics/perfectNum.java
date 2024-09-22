package recursionbasics;

import java.util.Scanner;

public class perfectNum {

	static int sumOfDivisors(int n,int in) {

		if(in>n/2) {
			return 0;
		}
		return (n%in==0?in:0)+sumOfDivisors(n,in+1);
	}

	static boolean isPerfect(int n) {
		return n==sumOfDivisors(n,1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		System.out.println(isPerfect(n));


	}

}
