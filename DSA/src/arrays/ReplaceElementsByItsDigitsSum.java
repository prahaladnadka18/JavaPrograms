package arrays;

import java.util.Scanner;

public class ReplaceElementsByItsDigitsSum {

	/*static int sumOfDigits(int n) {
		int sum=0;

		do {
			sum+=n%10;
			n=n/10;
		}while(n!=0);

		return sum;
	}

	static void replace(int[] x) {
		for(int i=0;i<x.length;i++) { 
			x[i]=sumOfDigits(x[i]);
		}
	}*/

	static void replace(int[] x) {
		for(int i=0;i<x.length;i++) { 
			int sum=0;
			do {
				sum+=x[i]%10;
				x[i]=x[i]/10;
			}while(x[i]!=0);

			x[i]=sum;
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

		replace(ar);

		System.out.println("----------------------------");

		for(int i=0;i<n;i++) { // displaying elements
			System.out.println(ar[i]);
		}

	}

}
