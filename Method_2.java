package com.Interview;

import java.util.Scanner;

public class Method_2 {

	public static void main(String[] args) {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String str=nobi.nextLine();
		String[] n=str.split("");
		for (int  i =n.length-1;  i >=0;  i--) {
			System.out.print(n[i]+"");
		}
		nobi.close();
	}

}
