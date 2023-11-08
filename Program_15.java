package com.Interview;

import java.util.Scanner;

public class Program_15 {

	public static void main(String[] args) {
	//15.WAJP to find the duplicate characters in a string.
	Scanner nobi=new Scanner(System.in);
	System.out.println("enter the input String: ");
	String str=nobi.nextLine();
	int count =0;
	char[] chars=str.toCharArray();
	System.out.println("Duplicate characters are: ");
	for(int i=0; i<str.length();i++) {
		for(int j=i+1; j<str.length();j++){
			if(chars[i] == chars[j]) {
				System.out.println(chars[j]);
				count++;
				break;
			}
		}
	}
	nobi.close();
	}

}
