package org.statics;

public class Staticvariable {
	
	static int number=1000;
static String name;

// in static variable finally what value we updated that value only will come
	
	public static void main(String[] args) {
		
		Staticvariable obj = new Staticvariable();
		obj.number=2000;
		obj.name="kavi";
		
		System.out.println(number);
		System.out.println(name);
		
	}

}
