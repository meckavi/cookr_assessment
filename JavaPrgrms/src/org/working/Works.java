package org.working;

public class Works {
	
	static String a="hello";
	
	static void usebuffer() {
		
		StringBuffer buff = new StringBuffer();
		
		buff.append(a);
		
		System.out.println(buff.reverse());
	}
	
	static void charar() {
		
		char[] c = a.toCharArray();
		String reverse="";
		
		for(int i=c.length-1;i>=0;i--) {
			
			reverse=reverse+c[i];
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		
		usebuffer();
		
		charar();
	}

}
