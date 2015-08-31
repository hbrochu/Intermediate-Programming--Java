class TestHand{
	public static void main(String [] args){
		Hand hand = new Hand();
		Deck deck = new Deck();
		
		deck.shuffle();
		System.out.println(deck.toString());
		
		for(int i =0; i<10; i++){
			hand.add(deck.getTopCard());
		}
		System.out.println(hand.toString());
		System.out.println(deck.toString());
		hand.clear();
		System.out.println(hand.isEmpty());
				
















	}//end main
}//end class