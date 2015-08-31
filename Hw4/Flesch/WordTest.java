


public class WordTest{
	
	public static void main(String [] args){
		Word testWord = new Word("brain");
	
		System.out.println("syllable count: "+ testWord.countSyllables());
		System.out.println("Word contains: "+ testWord.getWord());
		System.out.println("This is a vowel: "+ testWord.isVowel('a'));


		Word testWord2 = new Word("boote");
	
		System.out.println("syllable count: "+ testWord2.countSyllables());
		System.out.println("Word contains: "+ testWord2.getWord());
		System.out.println("This is a vowel: "+ testWord2.isVowel('n'));


		Word testWord3 = new Word("banana");
	
		System.out.println("syllable count: "+ testWord3.countSyllables());
		System.out.println("Word contains: "+ testWord3.getWord());
		System.out.println("This is a vowel: "+ testWord3.isVowel('y'));


























	}//end main
}//end class