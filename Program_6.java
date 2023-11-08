package com.Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program_6 {

	public static void main(String[] args) {
		//6.WAJP to iterate HashMap using While and advance for loop.
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"nobi");
		m.put(3, "chan");
		m.put(6, "neelu");
		System.out.println(m.size());
		System.out.println("While loop: ");
		Iterator itr=m.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry) itr.next();
			System.out.println("key is= "+me.getKey() +"; " + "value is= " + me.getValue());
		}
		System.out.println("For loop: ");
		for(Map.Entry me2: m.entrySet()) {
			System.out.println("Key is= " + me2.getKey() + "; " + "Value is= " + me2.getValue());
		}
	}
}
