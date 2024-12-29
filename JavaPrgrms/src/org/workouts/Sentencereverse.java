package org.workouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Sentencereverse {
	
	static void usingcollection() {
		
		String given ="Hi how are you";
		
		String[] split = given.split(" ");
		
		//char[] charArray = given.toCharArray();
		
		List<String> li = new ArrayList<String>();
		
		for (String string : split) {
			
			li.add(string);
			
		}
		Collections.reverse(li);
		
		
		ListIterator<String> s=li.listIterator();
		while (s.hasNext()) {
			System.out.print(s.next()+" ");
			
		}
	}
	
	public static void main(String[] args) {
		usingcollection();
	}

}
