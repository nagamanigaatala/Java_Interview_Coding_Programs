package com.Interview;

import java.util.Scanner;

public class Program_18 {

	public static void main(String[] args) {
	//18.WAJP to remove all white spaces from a string with using replace().
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String str=nobi.nextLine();
		String str2=str.replaceAll("\\s", "");
		System.out.println(str2);
		
	}

}
