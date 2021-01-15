package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the amount of the bill:\n");
		String billed = myScanner.nextLine();
		
		
		double billAmount = Double.parseDouble(billed);
		
		System.out.println("Please enter the amount tendered:\n");
		String tendered = myScanner.nextLine();
		
		double tenderAmount = Double.parseDouble(tendered);
		
		if (tenderAmount < billAmount) {
			System.out.println("$" + (billAmount - tenderAmount) + " Needed");
		}
		else {	
		System.out.println("The change required is " + "$" + (tenderAmount - billAmount));
		}

	}

}
