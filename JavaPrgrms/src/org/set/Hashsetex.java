package org.set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex {
	public static void main(String[] args) {
		
	
	HashSet hi = new HashSet();
	hi.add("1");
	hi.add("2");
	hi.add("3");
	hi.add("1");   // duplicates not allowed
	hi.add("null"); // insertion order is not followed
	
	System.out.println(hi);
	

	
	// contains
	
	System.out.println(hi.contains("3"));
	
	Iterator it = hi.iterator();
	while (it.hasNext()) {
		
		System.out.println("using iterator"+ it.next());
		
	}
	
	HashSet hi1= new HashSet<>();
	
	hi1.addAll(hi);
	
	System.out.println(hi1.containsAll(hi));
	
	System.out.println(hi1.contains("1"));
	

}}
