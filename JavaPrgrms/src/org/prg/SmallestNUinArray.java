package org.prg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestNUinArray {
	
	int a[]= {3,2,5,4,1000,1};
	
	
	private void Maxvalue() {
		
		int max=a[0];
		
		for(int i =0;i<a.length-1;i++) {
			if (max<a[i]) {
				
				max=a[i];
				
			}
			
		}
		System.out.println(max);
		
	}
	
	private void Minivalue() {
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			while (max>a[i]) {
				max=a[i];
				
			}
		}
System.out.println(max);
		
	}
	
	public void secondndlargest() {
		
	//Arrays.sort(a);
		Arrays.sort(a);
	
	for (int i = 0; i < a.length; i++) {
		
		//System.out.print(a[i]+" "); // 1 2 3 4 5 1000
		
	}
	
	System.out.println(a[a.length-6]);
	
	
	
		
	}
	void collec() {
		int a[]= {3,2,5,4,1000,1};
		
		int small = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<small) {
				small= a[i];
				
			}
			
		}System.out.println(small);
		
		
	}
		
		
		

	
	
	public static void main(String[] args) {
		
		SmallestNUinArray obj = new SmallestNUinArray();
//		obj.Maxvalue();
//		obj.Minivalue();
		obj.secondndlargest();
		//obj.collec();
}}
