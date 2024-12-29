package org.prg;

public class Occurance {
	
	void  interview() {
		String given = "aabbccc";
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		String given = "Kavteiuaavy";
		
		char tofind = 'k';
		
		given=given.toLowerCase();
		
		int occurance =0;
		
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)==tofind) {
				occurance++;
				
			}
		}
		System.out.println(occurance);
	}

}
