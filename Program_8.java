package com.Interview;

import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
		//8.WAJP to find whether a string or number is palindrome or not.
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String str=nobi.nextLine();
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) 
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		nobi.close();
	}
}
