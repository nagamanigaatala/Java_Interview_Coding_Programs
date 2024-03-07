package com.Demo;  

import java.io.IOException;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args)  {
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input: ");
		String s=nobi.nextLine();
		s=s.toLowerCase();
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' 
					|| s.charAt(i)=='u') {
				
				count++;
			}
			
		}
		System.out.println(count);
	}
 
}
