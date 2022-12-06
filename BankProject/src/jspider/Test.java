package jspider;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new BankImpl(1000);		// Upcasting 
		while(true){
			System.out.println("1.Deposite\n2.Withdraw\n3.Check Balance\n4.Exit");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter Amount to be deposited:");
				b.deposite(sc.nextInt());
				System.out.println("----------------");
				break;
			case 2:
				System.out.println("Enter Amount to be withdrawn:");
				b.withDraw(sc.nextInt());
				System.out.println("----------------");
				break;
			case 3:
				System.out.println("Balance: "+b.getBal());
				System.out.println("----------------");
				break;
			case 4:
				System.out.println("-----Thank you------");
				System.exit(0);
			default:
				System.out.println(b.errorMessage());
				System.out.println("----------------");
				break;
			}
		}

	}
}
