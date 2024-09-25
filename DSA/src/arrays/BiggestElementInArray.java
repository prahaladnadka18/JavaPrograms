package arrays;

import java.util.Scanner;

public class BiggestElementInArray {

	static int biggestElement(int[] x) {

		int big=x[0];
		for(int i=1;i<x.length;i++) {
			if(x[i]>big) {
				big=x[i];
			}
		}

		return big;
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

		System.out.println("Biggest Element is: "+biggestElement(ar));

		
	}

}
