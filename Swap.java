package com.Demo;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// without using 3rd variable
		/*Scanner nobi=new Scanner(System.in);
		System.out.println("enter the n value and m value:");
		int n=nobi.nextInt();
		int m=nobi.nextInt();
		System.out.println("before values: " + n +" "+ m);
		n= n+m;
		m= n-m;
		n= n-m;
		System.out.println("after swap: " + n +" "+ m);
		nobi.close();*/
		
	// using 3rd variable
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the n and m values: ");
		int n=nobi.nextInt();
		int m=nobi.nextInt();
		int s=' ';
		System.out.println("before swap: "  + n + " " +m);
		s= n;
		n=m;
		m=s;
		System.out.println("after swap: " + n +" "+ m);
		nobi.close();
		 
	}

}
