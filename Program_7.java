package com.Interview;

import java.util.Scanner;

public class Program_7 {

	public static void main(String[] args) {
		//7.WAJP to find whether a number is prime or not.
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input elements: ");
		int n=nobi.nextInt();
		int count=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime num");
		}
		else
			System.out.println("not prime");
		nobi.close();
	}
}
