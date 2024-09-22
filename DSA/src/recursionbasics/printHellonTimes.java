package recursionbasics;

import java.util.Scanner;

public class printHellonTimes {
	
	static void printHello(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.println("Hello");
		
		printHello(n-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		
		printHello(n);
		
	}

}
