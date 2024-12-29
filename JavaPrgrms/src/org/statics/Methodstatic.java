package org.statics;

public class Methodstatic {
	
	// static method
	private static void Staticmethod() {
		
		System.out.println("static method");

	}
	
	// Non static method
	private void Nonstaticmethod() {
		
		System.out.println("non static method");

	}
	
	
	public static void main(String[] args) {
	Staticmethod();
	Methodstatic obj = new Methodstatic();
	obj.Nonstaticmethod();
		
	}

}
