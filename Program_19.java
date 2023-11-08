package com.Interview;

import java.util.Scanner;

public class Program_19 {

	public static void main(String[] args) {
	//19.WAJP to remove all white spaces from a string without using replace().
	Scanner nobi=new Scanner(System.in);
	System.out.println("enter the input string: ");
	String str=nobi.nextLine();
	char[] chars=str.toCharArray();
	StringBuffer sb=new StringBuffer();
	for(int i=0; i<chars.length;i++) {
		if((chars[i]!=' ') && (chars[i]!='\t')){
			sb.append(chars[i]);
		}
	}
	System.out.println(sb);
	nobi.close();
	}
}
