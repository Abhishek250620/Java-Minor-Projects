// Basic Calculator project 
package com;

import java.util.Scanner;

public class Solution {
	static Scanner sc=new Scanner(System.in);
	static int a;
	static int b;
	static void enterOpt() {
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter secound number");
		b=sc.nextInt();
	}
	public static void main(String[] args) {
		Cal c=new CalculatorImpl(); //Upcasting --->Abstraction
		
		while(true) { // Infinite loop
			System.out.println("1.Addtion\n2.Diffrence\n3.Product\n4.Division\n5.Exit\nEnter choice");
			int op=sc.nextInt();
			if(op>0&&op<5) {
				enterOpt();
			}
			switch(op) {
			case 1: //  Addition operation
				System.out.println(c.add( a , b));
				break;
			case 2: // Difference operation
				System.out.println(c.sub( a , b));
				break;
			case 3: // Product Operation
				System.out.println(c.mul( a , b));
				break;
			case 4: // Division operation
				System.out.println(c.div( a , b));
				break;
			case 5: // Exit from the Program
				System.out.println("Thank you");
				System.exit(0);
			default:
				System.out.println("Inavalid Option");
			}
		}
	}
}
