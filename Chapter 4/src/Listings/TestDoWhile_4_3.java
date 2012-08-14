package Listings;

import java.util.Scanner;

public class TestDoWhile_4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.print("Enter an integer (Enter 0 to stop): ");
			data = input.nextInt();
			sum += data;
		}while(data != 0);
		
		System.out.println("The sum of all the entered numbers is " + sum);

	}

}
