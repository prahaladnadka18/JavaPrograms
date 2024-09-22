package com;

import java.util.Scanner;

public class BinarySearchLoop {

	static int binarySearch(int[] a, int ele, int low, int high) {

		while(low<=high) {

			int mid=(low+high)/2;

			if(a[mid]==ele) {
				return mid;
			}
			else if(ele>a[mid]){
				low=mid+1;
			}
			else
				high=mid-1;
		}

		return -1;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the "+n+"array elements");
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();		
		}

		System.out.println("Enter the elements to serach");
		int ele =  sc.nextInt();		

		System.out.println(binarySearch(a,ele,0,a.length-1));

	}
}


