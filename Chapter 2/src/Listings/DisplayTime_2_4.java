package Listings;

import java.util.Scanner;

public class DisplayTime_2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes in seconds
		int hours = minutes / 60;
		
		int remainingMinutes = minutes % 60;
		int remainingSeconds = seconds % 60; //Seconds remaining, 
		/* remainingSeconds explanation
		 * How many times does 60 goes into seconds
		 * and what is left over? what is left over is the answer
		 * 
		 * Lets say, we enter 500 seconds.
		 * 500/60 = 8.3, so 8 times.
		 * 8*60 = 480
		 * 20 are left over!
		 * 
		 */
		
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
		System.out.println("or");
		System.out.println(seconds + " seconds = " + minutes + ":" + remainingSeconds);
		System.out.println();
		System.out.println("Added for understanding it more");
		System.out.println(seconds + " seconds is " + hours+ " hours, " + remainingMinutes + " minutes and " + remainingSeconds + " seconds");
		System.out.println("or");
		System.out.println(seconds + " seconds = " + hours + ":" + remainingMinutes + ":" +remainingSeconds);
	}

}
