/**
	This program will take the subtotal and gratuity rate from the user.
	It will take these values and calculate the gratuity amount and the total bill.
*/
/**
	collaborators/references: none
*/

import javax.swing.JOptionPane;

public class Tips{
	public static void main(String[] args){
		String inputGratuityRate;	//user input gratuity rate
		String inputSubtotal;			//user input subtotal
		double gratuityRate;			//gratuity rate as double
		double subtotal;				//subtotal as double
		double gratuity;				//gratuity amount as double
		double total;					//total bill as double
		String message;					//returned user info in string
		
		//Gathers the gratuity rate from the user
		inputGratuityRate= JOptionPane.showInputDialog("Enter the gratuity rate in decimal form.");
		
		//Gathers the subtotal from the user
		inputSubtotal= JOptionPane.showInputDialog("Enter the subtotal for your bill.");
		
		//converts the Gratuity string into type double
		gratuityRate= Double.parseDouble(inputGratuityRate);
		
		//converts the subtotal string into type double
		subtotal= Double.parseDouble(inputSubtotal);
		
		//calculates the gratuity amount
		gratuity= gratuityRate * subtotal;
		
		//calculates the total bill
		total= gratuity + subtotal;
		
		//display info back to the user
		//prepare string
		message= String.format("%-8s%8.2f\n%-8s$%8.2f\n%-8s$%8.2f\n%-8s$%8.2f\n","Gratuity Rate:", gratuityRate, "Subtotal:", subtotal, "Gratuity Amount:", gratuity, "Total Cost:", total);
		
		//output to JOptionPane
		JOptionPane.showMessageDialog(null, message);
		
	
	
	
	}//end main
}//end class