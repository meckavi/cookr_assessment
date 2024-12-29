package org.prg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SentenceReverse {
	
	public static void main(String[] args) {
		
		String given= "How r u";
		
		//String reversed = "";
		
		
		System.out.println(given.length());
		
		String[] a=given.split(" ");
		
		System.out.println(a.length);
		
		
		  List<String> li = new ArrayList<String>();
		   
		  for (String string : a) {
			  
			  li.add(string);
			  
			
		}
		  
		  Collections.reverse(li);
		  
		  ListIterator<String> it =li.listIterator();
		  while (it.hasNext()) {
			  
			  System.out.print(it.next()+" ");
			
		}
		
//		for(int start=a.length-1;start>=0;start--) {
//			reversed=reversed+a[start]+" ";
//		}
//		System.out.println(reversed);
}}
