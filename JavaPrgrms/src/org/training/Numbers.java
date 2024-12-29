package org.training;

import java.util.Scanner;

public class Numbers {
	private static void reversing() {
		// TODO Auto-generated method stub
		int given=321;
		int reversed=0;
		
		System.out.println(given/10);

//		while (given!=0) {
//
//
//			reversed=reversed*10;
//			reversed=reversed+given%10;
//			given=given/10;
//		}
//		System.out.println(reversed);
	}

	private static void reve() {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("enter");
		
		int given = scan.nextInt();
		
		
		int reversed=0;
		
		while(given!=0) {
		reversed=reversed*10;
		reversed=reversed+given%10;
		given=given/10;}
		System.out.println(reversed);
		
		
		
	}

	public static void main(String[] args) {

		//reversing();
		reve();

	}}
