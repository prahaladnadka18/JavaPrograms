package com;

import java.util.Scanner;

public class towerOfHanoi {

	static void moveDisk(int n,char src,char temp,char dest) {

		if(n==1) {
			System.out.println("Move disk "+n+" from "+src+" to "+dest);
			return ;
		}

		moveDisk(n-1,src,dest,temp);

		System.out.println("Move disk "+n+" from "+src+" to "+dest);

		moveDisk(n-1,temp,src,dest);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter no of disks:");
		int n=sc.nextInt();

		moveDisk(n,'S','T','D');


	}

}
