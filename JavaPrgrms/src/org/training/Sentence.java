package org.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sentence {
	String a ="hi how r u";
	
	void usingcollection() {
		
	String[] c=	a.split(" ");

	
	System.out.println(c.length);
	
	List<String> li=new ArrayList<>();
	
	for (String string : c) {
		
		li.add(string);	
		//System.out.println(string);
	}
	
	
	Collections.reverse(li);
	
	ListIterator<String> lis=li.listIterator();
	while (lis.hasNext()) {
		System.out.print(lis.next()+" ");
		
	}
	
	}
		
	
	
	
	
	
	void split(){
		
		
		String reversed="";
		
		System.out.println(a.length());
		
		String[] s=a.split(" ");
		
		for(int i=s.length-1;i>=0;i--) {
			reversed=reversed+s[i]+" ";
		}
		System.out.println(reversed);
	}
	
	public static void main(String[] args) {
		Sentence obj=new Sentence();
		//obj.split();
		obj.usingcollection();
		
	
	
}}
