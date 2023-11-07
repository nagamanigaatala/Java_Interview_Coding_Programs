package com.Interview;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
//WAJP to reverse a string without using String inbuilt function.
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String n=nobi.nextLine();
		StringBuilder str=new StringBuilder();
		str.append(n);
		str=str.reverse();
		System.out.println(str);
		nobi.close();
		}
}
