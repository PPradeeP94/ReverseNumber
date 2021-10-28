package com.pdf_programs;

import java.util.Scanner;

import javax.swing.SizeSequence;

public class Sample {

	public static void main(String[] args) {
	/*	
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		System.out.println(next);
		
		Scanner sc1= new Scanner(System.in);
		int nextInt = sc1.nextInt();
		System.out.println(nextInt);
		
		if (nextInt>18) {
			System.out.println("not valid for driving license");
		}
		*/
//		String a = "welcome to tutorials";
//		String rev = "";
//		
//		String substr = a.substring(11);
////   	System.out.println(substr);
//		for (int i = substr.length()-1; i>=0; i--) {
//		rev = rev+substr.charAt(i);
//		}
////		System.out.println(rev);
//		
//		String replaceAll = a.replaceAll("tutorials", "");
////		System.out.println(replaceAll);
//		
//		String concat = replaceAll.concat(rev);
//		System.out.println(concat);
	
		
		String a = "welcome to tutorials";
		String rev = "";
		
		for (int i = a.length()-1; i>=0; i--) {
			rev = rev+a.charAt(12)+a;
		}
		System.out.println(rev);

		
		
   }

	}


