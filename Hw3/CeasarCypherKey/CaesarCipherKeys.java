/*
	Prompts the user for the name of an input file and an output file. The program then takes words from the
	input file and files them in a list ignoring words past the first twenty.
	The list is then sorted into alphabetical order. The output is a word count(20) and the alphabatized words with their
	index number. The program can also find words in the list if the user searches for it.
*/
/*
	collaborators/references: none
*/
import java.io.*;
public class CaesarCipherKeys{

	public static PrintWriter outFile()throws IOException{
		PrintWriter outFile = new PrintWriter("translations.txt");
		
		return outFile;
	}
	public static BufferedReader inFile()throws IOException{
		String inFileName;
		BufferedReader inFile = new BufferedReader(new FileReader("keys.txt"));

		
		return inFile;
	}
	
	
	public static void LoadFile(BufferedReader inFile, PrintWriter outFile;)throws IOException{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String word;
		String temp;
		StringBuilder words = new StringBuilder();
		StringBuilder code = new StringBuilder();
		int i= 0;
		do{
			word = inFile.readLine();
			
			for(int n=0; n<word.length();n++){
				if(word.charAt(n)!=' '){
					words.append(word.charAt(n));
				}
				for(int w=0; w<words.length(); w++){
					if(word.charAt(w)== words.charAt(n)){
						words.deleteCharAt(w);
					}

					
				}
				
			}
			i++;
		}while(word != null);//end while loop
		int length= alphabet.length();
		for(int p=0; p < length;){
			for(int x=0; x<=words.length(); x++){
				if (words.charAt(x)== alphabet.charAt(p)){
					p= p+1;
				}
				if(x==words.length()){
					words.append(alphabet.charAt(p));
				}
				x=-1;
			}
		}
		String cypherCode = words.toString();
		outFile.printf(alphabet + "\n" + cypherCode);
		outFile.close();
	}
	
	public static void main(String [] args)throws IOException{
		PrintWriter outFile;
		BufferedReader inFile;
		
		
		outFile = outFile();
		inFile = inFile();
		LoadFile(inFile, outFile);









	}//end main
}//end class