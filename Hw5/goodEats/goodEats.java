import javax.swing.*;

class goodEats{
	public static void main(String[] args){
		menu menu = new menu();
		menu.setTitle("Your menu - Hunter Brochu");
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.pack();
		menu.setVisible(true);
	}//end main
}//end class