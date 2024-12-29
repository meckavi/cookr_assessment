package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arrayexample {
	
	 void ex1() {
		
		 int a[]= {54,78,54,98,35};  // declare array without creating object
		 
		 System.out.println(a.length);
		 
		 System.out.println(Arrays.toString(a));  // to print any array using this method
		 
		 System.out.println("a[2]"  +    a[2]);
		 
		 System.out.println(a.length-1);
		 
		 
	}
	 
	  void ex2() {
		
		 String [] a= new String[5]; // declare array via creating an object
		 a[1]="suu";
		 a[2]="wyew";
		 a[3]="per";
		 a[4]="qwea";
		 a[0]="iwe";
		 
		 
		 
		 System.out.println(a.length);
		System.out.println("Using toarray method"+Arrays.toString(a));
		
		 
		 for(int i=0;i<=a.length-1;i++) {
			 System.out.println(a[i]);
			
		 }
		 
		
		// Iterator<String> it = new Iterator<String>() {
		};
		 
		 
		 
		 

	
	 
	 public static void main(String[] args) {
		
		 Arrayexample obj = new Arrayexample();
		 obj.ex1();
		obj.ex2();
	}
	
	
	

}
