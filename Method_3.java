package com.Interview;

import java.util.Scanner;

public class Method_3 {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String on=nobi.nextLine();
		String rev=" ";
		int length=on.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+on.charAt(i);
		}
		System.out.println(rev);
		nobi.close();
	}

}
