package com.Interview;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
//WAJP to reverse a string without using String inbuilt function reverse().
	// Method 1
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string:");
		String str=nobi.nextLine();
		char[] chars=str.toCharArray();
		for (int i = chars.length-1; i >=0; i--) {
			System.out.print(chars[i]);
		}
		nobi.close();
	}

}
