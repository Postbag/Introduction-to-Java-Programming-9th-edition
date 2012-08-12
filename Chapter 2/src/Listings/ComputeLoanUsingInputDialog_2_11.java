package Listings;

import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog_2_11 {
	public static void main(String[] args) {
		//Enter annual interest rate
		String annualInterestRateString = JOptionPane.showInputDialog(null, "Enter annual interest rate, for example, 8.25: ", "Program", JOptionPane.QUESTION_MESSAGE);
		
		//convert string to double
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		//obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//enter number of years
		String numberOfYearsString = JOptionPane.showInputDialog(null, "Enter number of years: ");
		
		//convert string to int
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		
		//enter loan amount
		String loanString = JOptionPane.showInputDialog("Enter loan amount: ");
		
		//convert String to double
		double loanAmount = Double.parseDouble(loanString);
		
		//calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/ Math.pow(1+ monthlyInterestRate, numberOfYears*12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		//format to keep two digists after the decimal point
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
		
		//Display results
		String output = "The monthly payment is $" + monthlyPayment + "\nThe total payment is $" + totalPayment;
		JOptionPane.showMessageDialog(null, output);
		
	}

}
