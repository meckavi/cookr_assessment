package org.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlistexample {
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<>();
		li.add("1");
		li.add("2");
		li.add("1");
		li.add("4");
		System.out.println(li);
		
		// add the value in first
		li.addFirst("0");
		
		//add the value in last
		li.addLast("5");;
		
		System.out.println(li);
		
		//get the first value
		
		System.out.println(li.getFirst());
		
		System.out.println(li.getLast());
		
		System.out.println(li.removeFirst());	
		System.out.println("FInal :"+ li);
		
		ListIterator<String> a = li.listIterator();
		while (a.hasNext()) {
			System.out.println("final"+ a.next());
			
		}
		 
		}

}
