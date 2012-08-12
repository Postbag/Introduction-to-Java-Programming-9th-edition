package Listings;

import java.util.Scanner;

public class CalculateBMI_myself {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weight in kg's: ");
		double userWeight = input.nextDouble();
		
		System.out.print("Enter your height in centimeters: ");
		double userHeight = input.nextDouble();
		double heightInMeters = userHeight / 100;
		
		double BMI = userWeight / (heightInMeters * heightInMeters);
		
		System.out.print("Your BMI = " + BMI);
	}

}
