import java.awt.event.*;

class purchaseListener1 implements ActionListener{
  //Handle events:  purchase buttons
	public void actionPerformed(ActionEvent e){
		billCalc.chooseItem(1);
		responseToUser.setText(billCalc.produceBill());

 	}// actionPerformed handler
}//class purchaseListener

class checkOutListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		responseToUser.setText("The bill total comes to: \n subtotal: "+ billCalc.subTotal + "\n Tax: 5% \n Grand Total: "+ billCalc.grandTotal);


	}// actionPerformed handler
}//class checkOutListener