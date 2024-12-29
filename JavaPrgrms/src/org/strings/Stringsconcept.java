package org.strings;

public class Stringsconcept {
	public static void main(String[] args) {
		
		String a = "KAVI ";
		
		
		int number=5;
		System.out.println(String.valueOf(number));
		
		String lower ="dhhhj";
		System.out.println(lower.toUpperCase());
		String upper ="SDJDJ";
		System.out.println(upper.toLowerCase());	
		
	
		System.out.println("Substring :"+a.substring(1));
		
		System.out.println("CharAt :"+a.charAt(1));
		
		System.out.println("Equals :"+a.equals("kavi"));
		
		System.out.println("equalignorecase :"+a.equalsIgnoreCase("kavi"));
		
		System.out.println("Length :"+a.length());
		
		System.out.println("Empty :"+a.isEmpty());
		
		System.out.println("CONTAINS :"+a.contains("k"));
		
		System.out.println("Substring 3 :"+a.substring(3));
		
		System.out.println("Substring 0,2 :"+a.substring(1,3));
		
		System.out.println("Indexof :"+a.indexOf("V"));
		
		System.out.println("Indexof :"+a.indexOf("I"));
		
		System.out.println("trim :"+a.trim());
		
		String concat = a.concat("hi");
		System.out.println("concat :"+concat);
		
		System.out.println(a.replace("V", "S"));
		
		
	}

}
