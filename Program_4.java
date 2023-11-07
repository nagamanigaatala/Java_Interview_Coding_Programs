package com.Interview;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
	//4.WAJP to swap two numbers without using the third variable.
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the n and m values: ");
		int n=nobi.nextInt();
		int m=nobi.nextInt();
		System.out.println("Before swapping: " + n+ m);
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("After swapping: " +n+m);
	}

}
