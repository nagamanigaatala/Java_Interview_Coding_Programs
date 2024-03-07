package com.Demo;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nobi=new Scanner(System.in);
		System.out.print("enter the input size: ");
		int n=nobi.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0; i<n;i++) {
			arr[i]=nobi.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		nobi.close();
	}

}
