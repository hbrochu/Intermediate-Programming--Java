/****************************************************************
*
* CS 110
* <br>The Sentence class represents many sentences. A sentence is considered to be any String ending in a '.'. Thus, in this context a Sentence object may contain strings that do not represent gramatically correct English sentences.
*
* @author Hunter Brochu <A HREF="mailto:hbrochu@uvm.edu"> (hbrochu@uvm.edu) </A>
*
*/

public class Sentence{
	private String s;
	private int wordCount = 0;
	private Word wordString; //= new Word();
	private int x = 0;
	private int sentenceCount = 0;
	
	Sentence(String str){
		s = str;
	}
	 /***************************************************************
    *
    *  Counts the number of words in the sentence object as defined by spaces and periods.
    *
    *  <br><b>Preconditions:</b> none
    *  <br><b>Postconditions:</b>
    *    see return
    *		@return integer
	 *				returns the number of words in the sentence as an integer
    */
	public int wordCount(){	
		for(int i = 0;i < s.length();i++){
			if(s.charAt(i) == ' ' || s.charAt(i) == '.'){
				wordCount++;
			}
			if(s.charAt(i) == ' ' && s.charAt(i-1) == '.'){
				wordCount = wordCount - 1;
			}
		}
		return wordCount;
	}
	 /***************************************************************
    *
    *  Returns the value of the next word in the sentence.
    *
    *  <br><b>Preconditions:</b> none
    *
    *  <br><b>Postconditions:</b>see return
    *
    *  @return Word
    *      Returns the next word in the sentence as a word object
    *
    */
	public Word nextWord(){
		StringBuffer word = new StringBuffer();
		while(x < s.length()){
			if(s.charAt(x) == ' '){
				wordString= new Word(word.toString());
				x++;
				return wordString;
			}
			else if( 48 > s.charAt(x) && s.charAt(x) > 33 || 97>s.charAt(x) && s.charAt(x) >90 || 65>s.charAt(x) && s.charAt(x) >58 || 126>s.charAt(x) && s.charAt(x)>123){
				x++;
			}
			else{
				word.append(s.charAt(x));
				x++;			
			}
		}
		return null;
	}
	 /***************************************************************
    *
    *  Returns the number of Sentences that end in a period in the sentence object.
    *
    *  <br><b>Preconditions:</b> none
    *
    *  <br><b>Postconditions:</b>see return
    *
    *  @return integer
    *      Returns the number of sentences in the sentence object as an integer.
    *
    */
	public int sentenceCount(){
		for(int i = 0;i < s.length();i++){
			if(s.charAt(i) == '.'){
				sentenceCount++;
			}
		}
		return sentenceCount;
	}
}//end class
