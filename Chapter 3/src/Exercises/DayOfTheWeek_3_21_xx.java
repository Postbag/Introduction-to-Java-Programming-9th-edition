package Exercises;

import java.util.Scanner;

public class DayOfTheWeek_3_21_xx {
	
	int year;	
	int q; // day of the month
	int m; // month
	int j; // century
	int k; // year of the century
	int h; // day of the week (result)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We need, year, month, day of the month
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter month: ");
		int m = input.nextInt();
		/*
		 * I still don't understand this part :\
		 */
		if (m == 1) { // Jan and Feb are counted as 13 and 14 in the formula
		      m = 13;
		      year--;
		    }
		    else if (m == 2) {
		      m = 14;
		      year--;
		    } 
		/*
		 * Untill here, oh nevermind. I get it
		 */
		
		System.out.print("Enter the day of the month (1-31): ");
		int q = input.nextInt();
		
		//Calculate the day of the week
		int j = year / 100;
		int k = year % 100;
		
		int h = (q + ((26*(m+1))/10) + k + (k/4) + (j/4) +(5*j)) % 7;
		
		if (h == 0) {
		      System.out.println("Day of the week is Saturday");
		    } else if (h == 1) {
		      System.out.println("Day of the week is Sunday");
		    } else if (h == 2) {
		      System.out.println("Day of the week is Monday");
		    } else if (h == 3) {
		      System.out.println("Day of the week is Tuesday");
		    } else if (h == 4) {
		      System.out.println("Day of the week is Wednesday");
		    } else if (h == 5) {
		      System.out.println("Day of the week is Thursday");
		    } else if (h == 6) {
		      System.out.println("Day of the week is Friday");
		    } 
		  
		


	}

}
