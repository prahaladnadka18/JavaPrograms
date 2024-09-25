package arrays;

import java.util.Scanner;

public class countOfOddAndEvenInArray {

	static int[] countEO(int[] x) {

		int eC=0,oC=0;

		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0) {
				eC++;
			}
			else {
				oC++;
			}
		}

		int[] count = {eC,oC};
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();

		int[] ar = new int[n]; 

		System.out.println("Enter "+n+" array elements");
		for(int i=0;i<n;i++) { 
			ar[i]=sc.nextInt();
		}

		System.out.println("----------------------------");

		int[] c= countEO(ar);

		System.out.println("Even Count: "+c[0]);
		System.out.println("Odd Count: "+c[1]);
	}

}
