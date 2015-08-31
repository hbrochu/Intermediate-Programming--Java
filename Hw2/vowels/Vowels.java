/**
	This program will return as many random vowels to the user as the number they enter
*/	
/**
	collaborators/references: none
*/


import javax.swing.JOptionPane;
import java.util.Random;

public class Vowels{
/*	public static String Letters(){
	
	}*/
/* Random (pseudo) number generator.
   rand.nextInt(6) gets values 0..5
	Of course, by adding one to any value in the range 0..5,
	you now have the range 1..6
*/
  	public static void RandomVowel(int userNum){
  		String vowels= "aeiou"; //vowels 	
		Random rand = new Random();//random number
		char vowel= '0'; 
		int i=1;
		
		while(i <= userNum){
			vowel= vowels.charAt(rand.nextInt(5));
			System.out.printf("Vowel " + i + ":" + vowel+ "\n");
 			i++;
		} 	
	}
	public static void main(String[] args){
		String inputNum;
		int userNum;
		
		inputNum= JOptionPane.showInputDialog("Please enter the amount of randomly \ngenerated vowels you want.");
		userNum= Integer.parseInt(inputNum);
		
		RandomVowel(userNum);




	}//end main
}//end class