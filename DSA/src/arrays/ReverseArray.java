package arrays;

import java.util.Scanner;

public class ReverseArray {

	static void reverseArray(int[] x) {

		int f=0,l=x.length-1;

		while(f<l) {
			int temp=x[f];
			x[f]=x[l];
			x[l]=temp;
			f++;
			l--;
		}

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
		System.out.println("Before Reverse:");
		for(int i=0;i<n;i++) { 
			System.out.println(ar[i]);
		}

		reverseArray(ar);

		System.out.println("----------------------------");
		System.out.println("After Reverse:");
		for(int i=0;i<n;i++) { 
			System.out.println(ar[i]);
		}

	}


}
