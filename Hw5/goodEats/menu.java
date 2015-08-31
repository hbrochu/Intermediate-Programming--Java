import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class menu extends JFrame{
	private JPanel menuPanel1, menuPanel2, menuPanel3;
	private JButton menuItem1, checkOut, menuItem2, menuItem3;
	private JTextField myName, itemName1;
	private billCalc billCalc = new billCalc();
	private ImageIcon item1 = new ImageIcon("spaghetti.jpg");
	private ImageIcon item2 = new ImageIcon("caesarsalad.jpg");
	private ImageIcon item3 = new ImageIcon("tacos.jpg");
	private JTextArea responseToUser = new JTextArea("", 10,1);
	
	public menu(){
		
	//adds the panels to the frame
	Container contentPane = getContentPane( ) ;
   contentPane.setLayout(new GridLayout(3,2,0,25));
	
	responseToUser.setEditable(false);
	contentPane.add(responseToUser);
	//establish the listeners
	purchaseListener1 purchaseListener1 = new purchaseListener1();
	purchaseListener2 purchaseListener2 = new purchaseListener2();
	purchaseListener3 purchaseListener3 = new purchaseListener3();
	checkOutListener checkOutListener = new checkOutListener();
	

	//establish a check out button
	contentPane.add(checkOut = new JButton("Check please"));
	
	checkOut.addActionListener(checkOutListener);
	
	//establish button to get menu item
	menuPanel1 = new JPanel();
	menuPanel2 = new JPanel();
	menuPanel3 = new JPanel();
	menuPanel1.setBorder(BorderFactory.createTitledBorder("Spaghetti - $10"));
	menuPanel2.setBorder(BorderFactory.createTitledBorder("Caesar salad - $8"));
	menuPanel3.setBorder(BorderFactory.createTitledBorder("Tacos - $15"));
	//button 1
	menuPanel1.add(menuItem1 = new JButton(item1));
	//button 2
	menuPanel2.add(menuItem2 = new JButton(item2));
	//button 3
	menuPanel3.add(menuItem3 = new JButton(item3));
	//add menu items to content panel
	contentPane.add(menuPanel1);
	contentPane.add(menuPanel2);
	contentPane.add(menuPanel3);
	//repack
	menuPanel1.pack();
	menuPanel2.pack();
	menuPanel3.pack();
	//activate listeners
	menuItem1.addActionListener(purchaseListener1);	
	menuItem2.addActionListener(purchaseListener2);	
	menuItem3.addActionListener(purchaseListener3);	
	


}

	
//listeners

	class purchaseListener1 implements ActionListener{
 	 //Handle events:  purchase buttons
		public void actionPerformed(ActionEvent e){
			billCalc.chooseItem(1);
			responseToUser.append("You have ordered: Spaghetti $"+ billCalc.itemPrice(1)+"\n");
 		}// actionPerformed handler
	}//class purchaseListener
	
	class purchaseListener2 implements ActionListener{
 	 //Handle events:  purchase buttons
		public void actionPerformed(ActionEvent e){
			billCalc.chooseItem(2);
			responseToUser.append("You have ordered: Caesar salad $"+ billCalc.itemPrice(2)+"\n");
 		}// actionPerformed handler
	}//class purchaseListener
	
	class purchaseListener3 implements ActionListener{
 	 //Handle events:  purchase buttons
		public void actionPerformed(ActionEvent e){
			billCalc.chooseItem(3);
			responseToUser.append("You have ordered: Tacos $"+ billCalc.itemPrice(3)+"\n");
 		}// actionPerformed handler
	}//class purchaseListener

	class checkOutListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			responseToUser.setText("The bill comes to: \n Subtotal: $"+ billCalc.subTotal() + "\n Tax: 5% \n Grand Total: $"+ billCalc.grandTotal());


		}// actionPerformed handler
	}//class checkOutListener









}//end class