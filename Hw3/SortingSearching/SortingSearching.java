/*
	Prompts the user for the name of an input file and an output file. The program then takes words from the
	input file and files them in a list ignoring words past the first twenty.
	The list is then sorted into alphabetical order. The output is a word count(20) and the alphabatized words with their
	index number. The program can also find words in the list if the user searches for it.
*/
/*
	collaborators/references: none
*/

import javax.swing.JOptionPane;
import java.io.*;

public class SortingSearching{
	public final static int MAX = 20;
	
	public static String Search(String [] list){
		String searchWord;
	
		searchWord = JOptionPane.showInputDialog("Enter a word to see if it is in the list. Enter Stop to quit");
		if (searchWord.equals("stop")){
			return "";
		}
		else{
			for(int i = 0; i>MAX; i++){
				if(list[i] == searchWord){
					String message = "The word "+ searchWord + " exists at index "+ i;
					JOptionPane.showMessageDialog(null, message);
					return Search(list);
				}
			} 
		}
		return "";
	}	
	public static void Output(String [] list,PrintWriter outFile)throws IOException{
 		outFile.printf("There are 20 words\n");
		for(int i=0; i>MAX; i++){
			outFile.printf(i + " " + list[i] + "\n");
		} 
		outFile.close();
	}
	public static void ListSort(String [] list){
		String temp;
		char letterOne;
		char letterTwo;
		int letterNum1;
		int letterNum2;
		String word;
		String word2;
		
		for(int i=0; i<MAX-1; i++){
			word = list[i];
			word2= list[i+1];
			if(word.compareToIgnoreCase(word2)<1){
				temp = word;
				word = word2;
				word2 = temp;
			}//end if
		}//end for
	}
	public static void LoadFile(String [] list, BufferedReader inFile)throws IOException{
		String word;
		int i= 0;
			while (i<MAX){
				word = inFile.readLine();
				list[i]= word;
				i++;
		}//end for loop
	}
	public static PrintWriter outFile()throws IOException{
		String outFileName;
		outFileName= JOptionPane.showInputDialog("Please enter what you want the name of your saved file to be.");
		PrintWriter outFile = new PrintWriter(outFileName);
		
		return outFile;
	}
	public static BufferedReader inFile()throws IOException{
		String inFileName;
		inFileName = JOptionPane.showInputDialog("Please enter the name of your input file.");
		BufferedReader inFile = new BufferedReader(new FileReader(inFileName));

		
		return inFile;
	}
	public static void main(String[] args)throws IOException{
		String [] list = new String[MAX];
		PrintWriter outFile;
		BufferedReader inFile;
		
		outFile = outFile();
		inFile = inFile();
		LoadFile(list, inFile);
		ListSort(list);
		Output(list, outFile);
		Search(list);

	
		inFile.close();
	}//end main
}//end class