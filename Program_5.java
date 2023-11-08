package com.Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
//5.WAJP to count the number of words in a string using HashMap. 
		
		Scanner nobi=new Scanner(System.in);
		System.out.println("enter the input string: ");
		String str=nobi.nextLine();
		String[] split=str.split(" ");
		Map<String, Integer> m=new HashMap<>();
		for(int i=0; i<split.length;i++) {
			if(m.containsKey(split[i])) {
				int count=m.get(split[i]);
				m.put(split[i], count+1);
			}
			else {
				m.put(split[i], 1);
			}
		}
		System.out.println(m);
		nobi.close();
	}

}
