package org.training;

public class Arraycintainslementornot {
	
	public static void presentornot() {
		
		int[] a = {1,4,2,6,7,8};
		
		Boolean find =false;
		
		int found=15;
		
		for (int i : a) {
			
			if (i==found) {
				find = true;
				break;
				
			}
			
		}
		if (find) {
			System.out.println("Number Present");
			
		}else {
		System.out.println("Number not Present");}
	}
	
	public static void main(String[] args) {
		presentornot();
	}

}
