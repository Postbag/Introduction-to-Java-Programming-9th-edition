package Listings;

import java.util.Scanner;

public class GuessNumber_4_3 {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess the magic number between 0 - 100 : ");
		int guess = -1; //can't be anything 0-100, else you'll automaticly win
		while(guess !=number){
			guess = input.nextInt();
			if(guess == number)
				System.out.println("Nice, you guessed it!");
			else if(guess > number)
				System.out.println("Too high!");
			else 
				System.out.println("Too low!");
			
		}

	}

}
