import java.util.*;

class Hand{
	private ArrayList <Card> hand = new ArrayList<Card>();
	private StringBuffer myHand;
	private Iterator <Card> iter = hand.iterator();

	
	Hand(){

	}//end constructor 

	public void add(Card card){
		hand.add(card);
	
	}
	public boolean isEmpty(){
		return hand.isEmpty();
	}
	public void clear(){
		hand.clear();
	}
	public String toString(){
		iter = hand.iterator();
		myHand = new StringBuffer();
		while(iter.hasNext()==true){
			myHand.append(iter.next().toString());
			myHand.append("\n");		
		}
		return myHand.toString();
	}
	public int size(){
		return hand.size();
	}
	public Card get(int i){
		return hand.get(i);
	}














}//end class