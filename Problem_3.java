package com.Interview;

import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
   //3 WAJP to swap two numbers using the third variable.
		
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the n and m values: ");
		int n=nobi.nextInt();
		int m=nobi.nextInt();
		System.out.println("Before swapping: " + n + m);
		int temp;
		temp =n;
		n= m;
		m=temp;
		System.out.println("After swapping: " + n+ m);
		nobi.close();
	}

}
