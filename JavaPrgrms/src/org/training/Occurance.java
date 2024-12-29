package org.training;

public class Occurance {

	static void Usingiteration() {
		
	
	String b = "oaWasa";
	
	char tofind='a';
	
	int occurance=0;
	
	for(int i=0;i<b.length();i++) {
		
		if(b.charAt(i)==tofind) {
			occurance++;
		}
		
	}System.out.println(tofind + " is presented in " + occurance + " times");
	
	}
	
	static void withoutiteration() {
		
		String a="ieyywi";
		
		int before = a.length();
		
		char tofind='y';
		
		String string = Character.toString(tofind);
		
		String replace = a.replace(string, "");
		
		int after = replace.length();
		
		System.out.println(before-after);
		
//		String b="Agniprasath";
//		
//		char tofind='a';
//		
//		String input = b.toUpperCase();
//		
//		int beforereplcelength = input.length();
//		
//		String chartofind = Character.toString(tofind).toUpperCase();  // to convert char to string
//		
//		// to replace empty string to "A" place in input
//		
//		String afterreplacelength = input.replace(chartofind, "");
//		
//		int length = afterreplacelength.length();
//		
//		
//		
//		System.out.println(beforereplcelength-length);
		
		
		
		
		
		
	}
	
public static void main(String[] args) {
	
	//Usingiteration();
	withoutiteration();
	
}
}
