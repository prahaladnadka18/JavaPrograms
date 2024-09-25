package arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	static int sumOfElements(int[] x) {

		int sum=0;
		for(int i=0;i<x.length;i++) { // initialization
			sum+=x[i];
		}
		return sum;
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

		System.out.println(sumOfElements(ar));

	}
}
