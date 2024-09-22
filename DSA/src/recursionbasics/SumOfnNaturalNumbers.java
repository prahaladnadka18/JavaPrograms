package recursionbasics;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
	
	static int displayNum(int n) {
		if(n==0) {
			return 0;
		}
		
		return n+displayNum(n-1);
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		System.out.println(displayNum(n));


	}

}
