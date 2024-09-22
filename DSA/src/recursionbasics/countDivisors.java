package recursionbasics;

import java.util.Scanner;

public class countDivisors {

	static int countDivisors(int n,int in){

		if(in>n/2) {
			return 0;
		}

		return (n%in==0?1:0)+countDivisors(n,in+1);
	}

	static int coutDivisors(int n){

		return 1+countDivisors(n,1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		System.out.println(coutDivisors(n));


	}

}
