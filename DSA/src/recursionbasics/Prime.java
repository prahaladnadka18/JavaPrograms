package recursionbasics;

import java.util.Scanner;

public class Prime {
	
	static boolean isPrime(int n,int in) {
		if(in>n/2) {
			return true;
		}
		if(n%in==0) {
			return false;
		}
		
		return isPrime(n,in+1);
	}
	
	static boolean isPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		return isPrime(n,2);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();

		System.out.println(isPrime(n));


	}

}
