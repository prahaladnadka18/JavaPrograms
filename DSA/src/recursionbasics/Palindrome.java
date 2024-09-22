package recursionbasics;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPlaindrome(String str,int f,int l) {
		
		if(l<=f) {
			return true;
		}
		
		if(str.charAt(f)!=str.charAt(l)) {
			return false;
		}
		
		return isPlaindrome(str,f+1,l-1);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();

		System.out.println(isPlaindrome(str,0,str.length()-1));


	}

}
