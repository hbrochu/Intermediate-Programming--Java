

class TestCard{
	public static void main(String [] args){
		Card card1 = new Card("heart", "3");
		Card card2 = new Card("diamond", "10");
		Card card3 = new Card("spade", "King");

	
		card2.setSuit("heart");
		System.out.println(card2.equals(card1));
		card2.setRank("3");
		System.out.println(card2.equals(card1));
		card3.setPictureName("bananas.jpg");
		System.out.println(card3.getSuit());
		System.out.println(card1.getRank());
		System.out.println(card3.getPictureName());
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());









	}//end main
}//end class