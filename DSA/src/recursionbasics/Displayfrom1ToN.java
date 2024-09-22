package recursionbasics;

import java.util.Scanner;

public class Displayfrom1ToN {

	static void displayNum(int n) {

		displayNum(n-1);
		
		if(n==0) {
			return ;
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
