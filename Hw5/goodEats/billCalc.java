class billCalc{
	private static double itemPrice = 0;
	private static double totalBill = 0;
	private static final double TAX = .05;
	private static double[] price = new double[3];
	private static String bill;
	
	
	public billCalc(){
	price[0] = 10.00;
	price[1] = 8.00;
	price[2] = 15.00;
	}
	public static double itemPrice(int w){
		return price[w-1];
	}
	public static void chooseItem(int x){
		itemPrice = price[x-1];
		totalBill = totalBill + itemPrice;
	}
	public static double getPrice(int i){
		return price[i-1];
	
	}
	public static double grandTotal(){
		return (totalBill*TAX)+totalBill;
	}
	public static double subTotal(){
		return totalBill;
	}
















}//end class