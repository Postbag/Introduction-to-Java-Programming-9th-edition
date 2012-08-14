package Exercises;

import java.util.Scanner;

public class LearnAddition_3_4_xx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		
		System.out.println("What is " +num1+ " + " + num2 + "?");
		System.out.print("Answer: ");
		int answer = input.nextInt();
		System.out.println("Your answer is " + (num1+num2 == answer));

	}

}
