package org.statics;

public class Staticblock {
	
	static {
		System.out.println("1st static block");
	}
	
	static {
		
		System.out.println("2nd static block");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside the main method");
		
	}

}
