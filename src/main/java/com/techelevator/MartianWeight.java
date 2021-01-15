package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		//prompt for earth weights
		System.out.println("Please enter 3 Earth weights separated by spaces: ");
		String answer = myScanner.nextLine();
		
		//split earth weights into an array
		String[] earthweights = answer.split(" ");
		
		for (int i = 0; i < earthweights.length; i++) {
			
			int earthfloat = Integer.parseInt(earthweights[i]);
			
			int marsweight = (int) (earthfloat * 0.378);
			
			System.out.println(earthweights[i] + "lbs. on Earth, is " + marsweight + "lbs. on Mars.");
		}

	}

}
