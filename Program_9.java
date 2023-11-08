package com.Interview;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {
	//9.Write a Java Program for the Fibonacci series.
		Scanner nobi=new Scanner(System.in);
		System.out.print("enter the input: ");
		int n=nobi.nextInt();
		int  a=0, b=1, c;
		for(int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
		}
		nobi.close();
	}
}
