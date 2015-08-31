import java.util.*;
import java.util.Random;
class Deck{
	private ArrayList <Card> deck = new ArrayList<Card>();
	private Random rand = new Random();
	private Card card;
	private Iterator <Card> iter = deck.iterator();
	private Card temp1;
	private int tempIndex;
	private StringBuffer sentence;
	private int tempInt1;
	private int tempInt2;
	private Card bottomCard;
	private int bottomCardIndex;
	
	Deck(){
		for(int i=2; i<10; i++){
			deck.add(card = new Card(""+i,"heart",i));
			card.setPictureName(i+"h.gif");
		}
		deck.add(card = new Card("Ten", "heart", 10));
		card.setPictureName("th.gif");
		deck.add(card = new Card("Jack", "heart", 10));
		card.setPictureName("jh.gif");
		deck.add(card = new Card("Queen", "heart",10));
		card.setPictureName("qh.gif");
		deck.add(card = new Card("King", "heart",10));
		card.setPictureName("kh.gif");
		deck.add(card = new Card("Ace", "heart",11));
		card.setPictureName("ah.gif");
		
		for(int i=2; i<10; i++){
			deck.add(card = new Card(""+i,"spade",i));
			card.setPictureName(i+"s.gif");
		}
		deck.add(card = new Card("Ten", "spade", 10));
		card.setPictureName("ts.gif");
		deck.add(card = new Card("Jack", "spade",10));
		card.setPictureName("js.gif");
		deck.add(card = new Card("Queen", "spade",10));
		card.setPictureName("qs.gif");
		deck.add(card = new Card("King", "spade",10));
		card.setPictureName("ks.gif");
		deck.add(card = new Card("Ace", "spade",11));
		card.setPictureName("as.gif");
		
		for(int i=2; i<10; i++){
			deck.add(card = new Card(""+i,"diamond",i));			
			card.setPictureName(i+"d.gif");
		}
		deck.add(card = new Card("Ten", "diamond",10));
		card.setPictureName("td.gif");
		deck.add(card = new Card("Jack", "diamond",10));
		card.setPictureName("jd.gif");
		deck.add(card = new Card("Queen", "diamond",10));
		card.setPictureName("qd.gif");
		deck.add(card = new Card("King", "diamond",10));
		card.setPictureName("kd.gif");
		deck.add(card = new Card("Ace", "diamond",11));
		card.setPictureName("ad.gif");
		
		for(int i=2; i<10; i++){
			deck.add(card = new Card(""+i,"club",i));			
			card.setPictureName(i+"c.gif");
		}
		deck.add(card = new Card("Ten", "club",10));
		card.setPictureName("tc.gif");
		deck.add(card = new Card("Jack", "club",10));
		card.setPictureName("jc.gif");
		deck.add(card = new Card("Queen", "club",10));
		card.setPictureName("qc.gif");
		deck.add(card = new Card("King", "club",10));
		card.setPictureName("kc.gif");
		deck.add(card = new Card("Ace", "club",11));
		card.setPictureName("ac.gif");
	}//end constructor
	
	public Card getTopCard(){
		bottomCardIndex = deck.size()-1;
		bottomCard = deck.get(bottomCardIndex);
		deck.remove(bottomCardIndex);
		return bottomCard;
	}
 	public void shuffle(){
		iter = deck.iterator();
		for(int i = 0; i<1000; i++){
			tempInt1 = rand.nextInt(deck.size());
			tempInt2 = rand.nextInt(deck.size());
			temp1 = deck.get(tempInt1);
			deck.set(tempInt1, deck.get(tempInt2));
			deck.set(tempInt2, temp1);	
		}
	}
	public String toString(){
		sentence = new StringBuffer();
		iter = deck.iterator();
		while(iter.hasNext()==true){
			sentence.append(iter.next().toString());
			sentence.append("\n");		
		}
		return sentence.toString();
	
	}

 
 
 
 
 
 
 
 
 
 
 
 
 }//end class