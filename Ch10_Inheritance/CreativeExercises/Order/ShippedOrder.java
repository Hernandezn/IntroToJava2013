public class ShippedOrder extends Order{
	
	public double computePrice(){
		totalPrice=super.computePrice()+4.0;
		return totalPrice;
	}
}