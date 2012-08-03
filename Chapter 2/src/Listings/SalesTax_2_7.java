package Listings;

import java.util.Scanner;

public class SalesTax_2_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is €" + (int)(tax*100) / 100.0); 
		//The .0 in 100.0 is very important!
	}

}
