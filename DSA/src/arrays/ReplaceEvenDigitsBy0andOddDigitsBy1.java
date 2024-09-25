package arrays;

import java.util.Scanner;

public class ReplaceEvenDigitsBy0andOddDigitsBy1 {
	
	static void updateElements(int[] x) {
		
		for(int i=0;i<x.length;i++) {
			x[i]=x[i]%2;
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();

		int[] ar = new int[n]; // array declaration & allocation

		System.out.println("Enter "+n+" array elements");
		for(int i=0;i<n;i++) { // initialization
			ar[i]=sc.nextInt();
		}
		
		updateElements(ar);

		System.out.println("----------------------------");

		for(int i=0;i<n;i++) { // displaying elements
			System.out.println(ar[i]);
		}

	}

}
