/****************************************************************
*
* CS 110
* <br>Word is an object that consists of a single word.
*
* @author Hunter Brochu <A HREF="mailto:hbrochu@uvm.edu"> (hbrochu@uvm.edu) </A>
*
*/

public class Word{
	private String w;
	private char ch;
	private int sylb = 0; //keeps track of the amount of sylables
	
	Word(){
		w = "hairy";
	}

	Word(String w){
		this.w= w;
	}
   /***************************************************************
   *
   * This counts the number of syllables in the word.
   *
   *
   * <br><b>Preconditions: </b>
   * <br>   none
   * <br>
   * <br><b>Postconditions: </b>
   * <br>   see return
   *
   * @return integer
   *     the number of syllables in the word
   *
   */
	public int countSyllables(){
		for(int i = 0; i < w.length(); i++){
			if(w.charAt(i)== 'a'||w.charAt(i)== 'e'||w.charAt(i)== 'i'||w.charAt(i)== 'o'||w.charAt(i)== 'u'||w.charAt(i)== 'y'){
				if(w.charAt(i)=='e' && i== w.length()-1){
					
				}
				else if(w.charAt(i)== 'e' && w.charAt(i+1)=='l' && i==w.length()-2){
					sylb++;
				}
				else if(i+1 != w.length() && ((w.charAt(i)== 'a'||w.charAt(i)== 'e'||w.charAt(i)== 'i'||w.charAt(i)== 'o'||w.charAt(i)== 'u'||w.charAt(i)== 'y') && (w.charAt(i+1)== 'a'||w.charAt(i+1)== 'e'||w.charAt(i+1)== 'i'||w.charAt(i+1)== 'o'||w.charAt(i+1)== 'u'||w.charAt(i+1)== 'y'))){
					sylb++;
					i++;
				}
				else{
					sylb++;
				}
			}
			else if(i==w.length()-1 && sylb==0){
				sylb++;
			}
		}
		return sylb;
	}
   /***************************************************************
   *
   * This gets the value of the current word
   *
   *
   * <br><b>Preconditions: </b>
   * <br>   none
   * <br>
   * <br><b>Postconditions: </b>
   * <br>   see return
   *
   * @return String
   *     Returns the word as a string
   *
   */
	public String getWord(){
		return w;
	}
	/***************************************************************
   *
   * This checks if a given letter is a vowel.
   *
   *
   * <br><b>Preconditions: </b>
   * <br>   A letter of choice
   * <br>
   * <br><b>Postconditions: </b>
   * <br>   see return
	* @param ch
   *         A given character.
   *
   * @return boolean
   *     true if the given character is a vowel, false otherwise
   *
   */
	public static boolean isVowel(char ch){
		if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'||ch== 'y'){
			return true;
		}
		else{
			return false;
		}
	}
	/***************************************************************
   *
   * Converts the word into a string variable.
   *
   *
   * <br><b>Preconditions: </b>
   * <br>   none
   * <br>
   * <br><b>Postconditions: </b>
   * <br>   see return
   *
   * @return String
   *     Returns the value of the word as a string
   *
   */
	public String toString(){
		String result = w;
		return result;
	}










}//end class