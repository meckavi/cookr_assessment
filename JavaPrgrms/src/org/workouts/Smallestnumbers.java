package org.workouts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Smallestnumbers {
	
	static int a[]= {12,24,87,0,15,23,54};
	
	static void usingarray() {
		
		Arrays.sort(a);
		
		System.out.println("small number  :"  +a[0]);
		
		System.out.println("max number  :"  +a[6]);
		
	}
	
	
	static void usingcollections() {
		
		Integer a[]= {12,24,87,0,15,23,54};
		
		
		List<Integer> li = Arrays.asList(a);
		
		Collections.sort(li);
		
		System.out.println(li.get(0));
		
		System.out.println(li.get(li.size()-1));
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		//usingarray();
		usingcollections();
		
	}
	

}
