/**
	This program will compute the tuition increase over a set number of years. The tuition, years, and annual increase rate
	will be input by the user.
*/
/**
	collaborators/references: none
*/

import javax.swing.JOptionPane;

public class Tuition{
	public static double getCurrentTuition() {
		/** Function prompts the user for the current tuition.
		If the current tuition value is not greater than 0, 
		the function code continues to ask for the value until a 
		valid input has been made.
		
		for question 1 part a
		*/
		double currentTuition;
		String inputTuition= "";
		inputTuition= JOptionPane.showInputDialog("Please input the cost of tuition at college this year.");
		currentTuition= Double.parseDouble(inputTuition);
		while(currentTuition < 0){
			inputTuition= JOptionPane.showInputDialog("Please input the cost of tuition at college this year.");
			currentTuition= Double.parseDouble(inputTuition);
		}
		return currentTuition;
	}//end function
	public static double getIncreaseRate(){
		//for question 1 part b
		String inputRate;			//user input Tuition rate
		double increaseRate;		//the rate tuition annualy increases by
		inputRate= JOptionPane.showInputDialog("Please input the rate at which tuition increases as a decimal.");
		increaseRate= Double.parseDouble(inputRate);
		while(increaseRate<0){
			inputRate= JOptionPane.showInputDialog("Please input the rate at which tuition increases as a decimal.");
			increaseRate= Double.parseDouble(inputRate);
		}
		return increaseRate;
	}
	public static int getYear(){
		//for part c
		String inputYears;
		int years;
		inputYears= JOptionPane.showInputDialog("How many years into the future do you want to know the tuition cost?");
		years= Integer.parseInt(inputYears);
		while(years<0){
			inputYears= JOptionPane.showInputDialog("How many years into the future do you want to know the tuition cost?");
			years= Integer.parseInt(inputYears);
		}
		return years;
	}
	public static double computeTuition(double currentTuition,
													double increaseRate,
													int years){
		double futureTuition;	//The future tuition cost
		int i;
		double increaseAmount;
		futureTuition= currentTuition;
		i=1;
		
		while(i<= years){
			increaseAmount= futureTuition*increaseRate;
			futureTuition= futureTuition+increaseAmount;
			i++;
		 
		}//end while loop
		return futureTuition;
	}
	public static void main(String[] args){
		double currentTuition;	//How much tuition currently costs
		double increaseRate;		//the rate tuition annualy increases by
		double increaseAmount;	//the amount the tuition increases by per year
		int years;					//How many years the tuition will be increased (user chosen)
		String message;			//For the response message
		int i;						//counter
		double futureTuition;
		
		currentTuition= getCurrentTuition();
		increaseRate= getIncreaseRate();
		years= getYear();
		futureTuition= computeTuition(currentTuition, increaseRate, years);
				
		
		message= "current annual tuition: $"+ currentTuition +"\nAnnual rate of increase: "+
					increaseRate*100 +"% \nNumber of years: "+ years + "\n"+ years +
					" years from now, the annual tuition will be $"+ futureTuition;

		JOptionPane.showMessageDialog(null,message);




	}//end main
}//end class