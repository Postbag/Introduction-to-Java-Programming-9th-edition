package Listings;

import java.util.Scanner;

public class LeapYear_3_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		//check if year is a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		
		System.out.println(year + " is a leap year? " + isLeapYear);

	}

}
