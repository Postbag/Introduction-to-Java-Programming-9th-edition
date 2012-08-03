package Listings;

import java.util.Scanner;

public class FahrenheitToCelsius_2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		/* Celsius explanation
		 * 
		 * 5/9 is translated to 5.0 / 9 instead of 5 / 9 in line 13
		 * because 5 / 9 yields 0 in Java. 
		 */
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}

}
