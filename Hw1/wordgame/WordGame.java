/**
	This program takes information from the user and enters them into a prepared story.
*/
/**
	collaborators/references: none
*/

import javax.swing.JOptionPane;

public class WordGame{
	public static void main(String[]args){
		String name;				//takes users name
		String age;				//takes users age
		String city;				//takes users city
		String college;			//takes users college
		String profession;		//takes users profession
		String animal;			//takes users type of animal
		String petName;			//takes users pet's name
		String message;			//output message at end
		
		//gathers user's name
		name= JOptionPane.showInputDialog("This program will gather information from you to create a story\n What is your name?");
		
		//gather user's age
		age= JOptionPane.showInputDialog("Please enter your age.");
		
		//gathers user's city
		city= JOptionPane.showInputDialog("Please enter the city you are in.");
		
		//gathers user's college
		college= JOptionPane.showInputDialog("Please enter the name of the college you attend.");
		
		//gathers user's profession
		profession= JOptionPane.showInputDialog("Please enter your profession.");
		
		//gathers user's type of animal
		animal= JOptionPane.showInputDialog("What type of animal is your pet or your favorite animal?");
		
		//gathers pet's name
		petName= JOptionPane.showInputDialog("What is the name of this pet/animal?");
		
		//outputs the story with the user's data
		message= "There once was a person named " + name + " who lived in " + city +
					". At the age of " + age + ", " + name + " went to college at " + college +
					". " + name + " graduated and went to work as a " + profession + ".\n Then, " + name +
					" adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!";
		
		JOptionPane.showMessageDialog(null, message);
	
	

	}//end main
}//end class