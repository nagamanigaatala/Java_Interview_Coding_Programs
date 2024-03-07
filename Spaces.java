package com.Demo;

import java.util.Scanner;

public class Spaces {

	public static void main(String[] args) {
		// How do you remove the spaces from a string
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String str=nobi.nextLine();
		//String str= " nobi chan neelu ";
		str= str.replace(" ", "");
		System.out.println(str);
	}

}
