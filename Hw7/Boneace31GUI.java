import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Boneace31GUI extends JFrame{
	private JPanel creatorName, playerHandPics, buttonPanel, compHandPics;
	private JLabel myName, playerScoreLabel, compScoreLabel;
	private JButton stick, haveIt, cardPanel, newGame;
	private Icon cardPic;
	private Deck deck = new Deck();
	private Hand hand = new Hand();
	private Hand compHand = new Hand();
	private int playerHandTotal = 0;
	private int compHandTotal = 0;
	private int playerScore, compScore;
	private JTextArea responseToUser = new JTextArea("", 20,1);

	
	public Boneace31GUI(){
		// adds my name to the GUI
		creatorName = new JPanel();
		creatorName.setLayout(new GridLayout(3,1));
		myName = new JLabel("Hunter Brochu");
		creatorName.add(myName);
		
		//scores
		playerScoreLabel = new JLabel();
		compScoreLabel = new JLabel();
		compScoreLabel.setVisible(true);
		creatorName.add(playerScoreLabel);
		creatorName.add(compScoreLabel);
		playerScoreLabel.setText("Player 1: " + 0);
		compScoreLabel.setText("Computer: " + 0);
		pack();
		//sets up the panel for the players hand
		playerHandPics = new JPanel();


		
		
		//set up the panel for the comp's hand
		compHandPics = new JPanel();
		compHandPics.setVisible(false);
		
		//sets up the respond label
		responseToUser.setEditable(false);
		responseToUser.setText("Welcome to the game of Bone-Ace! \n The goal of the game is to get 31 points or as close to \n it as possible. Each card is worth its number value, \n face cards are worth ten and aces are worth eleven. \n If there is a tie and someone holds the ace of spades you win!");
		responseToUser.setVisible(true);
		


	
		//main container
		Container contentPane = getContentPane( ) ;
      contentPane.setLayout(new GridLayout(3,1,0,25));
		contentPane.add(creatorName);
		contentPane.add(compHandPics);
		contentPane.add(responseToUser);
		contentPane.add(playerHandPics);
		contentPane.setSize(500,500);

		//buttons
		buttonPanel = new JPanel();
		buttonPanel.setVisible(true);
		buttonPanel.add(stick = new JButton("Stick!"));
		buttonPanel.add(haveIt = new JButton("Have It!"));
		stick.setVisible(true);
		haveIt.setVisible(true);
		
		buttonPanel.add(newGame = new JButton("New Game?"));
		newGame.setVisible(false);
		contentPane.add(buttonPanel);
		newGameListener newGameListener = new newGameListener();
		stickListener stickListener = new stickListener();
		haveItListener haveItListener = new haveItListener();
		//activate listeners
		newGame.addActionListener(newGameListener);
		stick.addActionListener(stickListener);	
		haveIt.addActionListener(haveItListener);
		pack();	

	
	
	}//end GUI class
	class newGameListener implements ActionListener{
 	 //Handle events:  new game button
		public void actionPerformed(ActionEvent e){
			deck = new Deck();
			hand = new Hand();
			compHand = new Hand();
			compHandPics.setVisible(false);
			newGame.setVisible(false);
			responseToUser.setText("Welcome to the game of Bone-Ace! \n The goal of the game is to get 31 points or as close to \n it as possible. Each card is worth its number value, \n face cards are worth ten and aces are worth eleven. \n If there is a tie and someone holds the ace of spades you win!");

			runGame();
			
 		}// actionPerformed handler
	}//class purchaseListener
	class stickListener implements ActionListener{
 	 //Handle events:  stick button
		public void actionPerformed(ActionEvent e){
			computerTurn();
 		}// actionPerformed handler
	}//class purchaseListener
	
	class haveItListener implements ActionListener{
 	 //Handle events:  stick button
		public void actionPerformed(ActionEvent e){
			Card dummy = deck.getTopCard();
			hand.add(dummy);
			playerHandTotal = playerHandTotal + dummy.getValue();
			cardPic = new ImageIcon("cards/" + dummy.getPictureName());
			cardPanel = new JButton(cardPic);
			cardPanel.setVisible(true);
			playerHandPics.add(cardPanel);
			pack();
			if(playerHandTotal >31){
				responseToUser.setText("Your hand has surpassed 31 points. \n You lose");
				responseToUser.setVisible(true);
				showCompHand();
				newGame.setVisible(true);
				compScore = compScore + 1;
				compScoreLabel.setText("Computer: " + compScore);
				}
 		}// actionPerformed handler
	}//class purchaseListener
	
	public void computerTurn(){
		if(compHandTotal < 23){
			Card dummy = deck.getTopCard();
			compHand.add(dummy);
			cardPic = new ImageIcon("cards/" + dummy.getPictureName());
			cardPanel = new JButton(cardPic);
			compHandPics.add(cardPanel);
			compHandTotal = compHandTotal + dummy.getValue();
		}
		if(compHandTotal >31){
			responseToUser.setText("The computer's hand has surpassed 31. \n You win!!");
			responseToUser.setVisible(true);
			showCompHand();
			newGame.setVisible(true);
			playerScore = playerScore + 1;
			playerScoreLabel.setText("Player 1: " + playerScore);
		}
		if(compHandTotal == 31){
			responseToUser.setText("The computer has gotten a perfect 31. \n You lose");
			responseToUser.setVisible(true);
			newGame.setVisible(true);
			compScore = compScore + 1;
			compScoreLabel.setText("Computer: " + compScore);
		}
		else{
			verdict();
		}
	}
	public void verdict(){
		//event of player having more points
		if(playerHandTotal > compHandTotal){
			responseToUser.setText("Your hand is closer to 31 than the computer's! \n Congratulations!");
			responseToUser.setVisible(true);
			showCompHand();
			newGame.setVisible(true);
			playerScore = playerScore + 1;
			playerScoreLabel.setText("Player 1: " + playerScore);
		}
		//event of a tie
		else if(playerHandTotal == compHandTotal){
			Card inQuestion;
			Card inQuestion2;
			int handSize = hand.size();
			boolean found = false;
			for(int i = 0; i < handSize ; i++){
				inQuestion = hand.get(i);
				inQuestion2 = compHand.get(i);
				if(inQuestion.getSuit() == "Ace" && inQuestion.getSuit() == "spade"){
					responseToUser.setText("You and the computer have the same amount of points but \n you have the boneace! \n Congratulations you win!");
					responseToUser.setVisible(true);
					showCompHand();
					newGame.setVisible(true);
					found = true;
					playerScore = playerScore + 1;
					playerScoreLabel.setText("Player 1: " + playerScore);
				}
				else if(inQuestion2.getRank() == "Ace" && inQuestion2.getSuit() == "spade"){
					responseToUser.setText("You and the computer have the same amount of points but \n the computer has the boneace! \n Sorry you lose");
					responseToUser.setVisible(true);
					showCompHand();
					newGame.setVisible(true);
					found = true;
					compScore = compScore + 1;
					compScoreLabel.setText("Computer: " + compScore);
				}
			}
			if(found = false){
				responseToUser.setText("You and the computer have the same amount of points and \n no one has the boneace! \n it is a tie!");
				responseToUser.setVisible(true);
				showCompHand();
				newGame.setVisible(true);
				playerScore = playerScore + 1;
				compScore = compScore + 1;
				playerScoreLabel.setText("Player 1: " + playerScore);
				compScoreLabel.setText("Computer: " + compScore);
			}
		}
		//event of computer having more points
		else{
			responseToUser.setText("The computer's hand is closer to 31 than yours. \n You have lost");
			responseToUser.setVisible(true);
			showCompHand();
			newGame.setVisible(true);
			compScore = compScore + 1;
			compScoreLabel.setText("Computer: " + compScore);
		}
	}
	
	public void drawHands(){
		Card dummy1;
		Card dummy2;
		for(int i = 0;i<3;i++){
			dummy1 = deck.getTopCard();
			dummy2 = deck.getTopCard();
			hand.add(dummy1);
			compHand.add(dummy2);
			playerHandTotal = playerHandTotal + dummy1.getValue();
			compHandTotal = compHandTotal + dummy2.getValue();
		}
	}// end function
	public void playerHand(){
		Card card;
		playerHandPics.removeAll();
		compHandPics.removeAll();
		for(int i = 0; i<hand.size();i++){
			card = hand.get(i);
			cardPic = new ImageIcon("cards/" + card.getPictureName());
			cardPanel = new JButton(cardPic);
			playerHandPics.add(cardPanel);
			card = compHand.get(i);
			cardPic = new ImageIcon("cards/"+ card.getPictureName());
			cardPanel = new JButton(cardPic);
			compHandPics.add(cardPanel);
		}
		pack();
	}//end function
	public void showCompHand(){
		compHandPics.setVisible(true);
	}//end function
	
	public void runGame(){
		compHandTotal = 0;
		playerHandTotal = 0;
		deck.shuffle();
		drawHands();
		playerHand();
	}
	
	
	
	public static void main(String [] args){

		Boneace31GUI bg = new Boneace31GUI();
		bg.setTitle("Bone-Ace!!!");
		bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bg.pack();
		bg.setVisible(true);
		bg.runGame();

	}//end main
}//end class 