import javax.swing.JOptionPane;


public class HotelBilling {
	final static float SALES_TAX = .013f;
	public static void main(String[] args) {
		
	
	
	 double roomRate = 95.00;
	 double coupon = .010;
	 int numberRooms = Integer.parseInt(JOptionPane.showInputDialog(" How many rooms would you like?"));

	double totalBill= calculateBill(roomRate, coupon, numberRooms);
	
		 JOptionPane.showMessageDialog(null, "your total is $" + totalBill);
}
	 public static double calculateBill(double rate) {
		 double tax = rate *SALES_TAX;
		 double finalRate = rate + tax;
		 finalRate = twoDecimalRounding(finalRate);
		 return finalRate;
		 
	 }
		 
	public static double calculateBill(double rate, double coupon){
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * (1 - coupon);
		return finalRate;
	}
	public static double calculateBill(double rate, double coupon, int numberRooms){
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * numberRooms * (1 - coupon);
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	
	public static  double twoDecimalRounding(double decimal) {
		decimal = decimal*100;
		decimal = decimal + 0.5;
		decimal =(int) decimal;
		decimal = decimal/100;
		return decimal;
	}
	
	
	
	}
	
	
	



