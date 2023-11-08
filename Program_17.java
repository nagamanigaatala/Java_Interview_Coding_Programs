package com.Interview;

import java.util.Scanner;

public class Program_17 {

	public static void main(String[] args) {
	//17.Write a Java Program to check Armstrong number.
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input elements: ");
		int n=nobi.nextInt();
		int a, temp, c=0;
		temp=n;
		while(n!=0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("armstrong num");
		else
			System.out.println("Not armstrong num");
		nobi.close();
	}
}
