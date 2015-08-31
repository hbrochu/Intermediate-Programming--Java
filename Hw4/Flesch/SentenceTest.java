public class SentenceTest{
	public static void main(String [] args){
		String testString = "I like fluffy monkeys. They eat bananas.";
		Sentence test = new Sentence(testString);
		Object tester;
		int data;
		
		data = test.wordCount();
		System.out.println(data);
		
		tester = test.nextWord();
		System.out.println(tester);
		
		tester = test.nextWord();
		System.out.println(tester);
		
		tester = test.nextWord();
		System.out.println(tester);
		
		data = test.sentenceCount();
		System.out.println(data);
		










	}//end main
}//end class