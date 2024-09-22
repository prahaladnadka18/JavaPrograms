package com;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int[] ar,int ele,int low,int high) {

		if(low>high)
			return -1;

		int mid = (low+high)/2;

		if(ar[mid]==ele)
		{
			return mid;
		}
		else if(ele>ar[mid])
		{
			low=mid+1;
		}
		else {
			high=mid-1;
		}

		return binarySearch(ar,ele,low,high);
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
