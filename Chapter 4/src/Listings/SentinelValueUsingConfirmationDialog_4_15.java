package Listings;

import javax.swing.JOptionPane;

public class SentinelValueUsingConfirmationDialog_4_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int option = JOptionPane.YES_OPTION;
		while(option == JOptionPane.YES_OPTION){
			String dataString = JOptionPane.showInputDialog("Enter an integer: ");
			int data = Integer.parseInt(dataString);
			
			sum += data;
			
			option = JOptionPane.showConfirmDialog(null, "Continue?");
		}
		
		JOptionPane.showMessageDialog(null, "The sum is " + sum);

	}

}
