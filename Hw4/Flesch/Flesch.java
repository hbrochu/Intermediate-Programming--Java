import java.io.*;
import javax.swing.JOptionPane;
/****************************************************************
*
* CS 110
* <br>Flesch is an application that calculates the Flesch-Kincaid grade level of a given text file.
*
* @author Hunter Brochu <A HREF="mailto:hbrochu@uvm.edu"> (hbrochu@uvm.edu) </A>
*
*/
public class Flesch{
	public static void main(String [] args)throws IOException{
		String fileName = "";		
		StringBuffer builder = new StringBuffer();
		String theStory;
		Word currentWord = new Word();
		int sylbCount = 0;
		int wordCount = 0;
		double gradeLevel;
		String line;
		
		
		fileName = JOptionPane.showInputDialog("Please enter the name of the file you wish know the \n Flesch-Kincaid grade level");
		BufferedReader inFile = new BufferedReader(new FileReader(fileName));
		do{
			line = inFile.readLine();
			builder.append(line);
		}while(line != null);
		theStory = builder.toString();
		Sentence CalcSentence = new Sentence(theStory);
		
		while(CalcSentence.nextWord() != null){
			currentWord = CalcSentence.nextWord();
			sylbCount = sylbCount + currentWord.countSyllables();
			wordCount++;
		}
		
		int sentenceCount = CalcSentence.sentenceCount();
		gradeLevel = ((0.39*(wordCount/sentenceCount)) + (11.8*(sylbCount/wordCount)) - 15.59);
		
		
		
		System.out.println("File Name: "+ fileName);
		System.out.println("Number of Syllables: "+ sylbCount);
		System.out.println("Number of Words: "+ wordCount);
		System.out.println("Number of Sentences: "+ sentenceCount);
		System.out.println("The Flesch-Kincaid grade level: "+ gradeLevel);













	}//end main
}//end class