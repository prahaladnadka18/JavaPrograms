package arrays;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();

		int[] ar = new int[n]; // array declaration & allocation

		System.out.println("Enter "+n+" array elements");
		for(int i=0;i<n;i++) { // initialization
			ar[i]=sc.nextInt();
		}

		System.out.println("----------------------------");

		for(int i=0;i<n;i++) { // displaying elements
			System.out.println(ar[i]);
		}

	}

}
