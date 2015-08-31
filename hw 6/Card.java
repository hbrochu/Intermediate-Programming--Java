

class Card{
	private String suit;
	private String Rank;
	private String pictureName;
	private int cardValue;
	
	Card(String rank, String suit, int value){
		this.suit = suit;
		this.Rank = rank;
		cardValue = value;
	}
	
	public void setSuit(String manualSuit){
		suit = manualSuit;
	}
	public void setRank(String manualRank){
		Rank = manualRank;
	}
	public void setPictureName(String fileName){
		pictureName = fileName;	
	}
	public String getSuit(){
		return suit;
	}
	public String getRank(){
		return Rank;
	}
	public String getPictureName(){
		return pictureName;
	}
	public String toString(){
		return "This card is "+ Rank + " of "+ suit;
	}
	public boolean equals(Card card){
		if(card.getSuit()!= this.suit || card.getRank()!= this.Rank){
			return false;
		}
		else{ return true;}
	}
	public int getValue(){
		return cardValue;
	}








}//end class