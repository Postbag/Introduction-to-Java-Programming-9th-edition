package ListingExcersises;

import java.util.Scanner;

public class LE2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer value for 'm', 'r' and 'PowerValue' to obtain the result of (m*r)^PowerValue. ");
		System.out.print("m = ");
		int m = input.nextInt();
		System.out.print("r = ");
		int r = input.nextInt();
		System.out.print("PowerValue = ");
		int mathPowerValue = input.nextInt();
		
		int mr = m * r;
		
		
		double mrP2 = Math.pow(mr, mathPowerValue);
		
		System.out.print("The result of (m*r)^2 : " + mrP2);
	}

}
