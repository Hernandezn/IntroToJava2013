public class Delivery{
	private int deliveryNumber;
	private int distanceCode;
	private double weight;
	private double deliveryFee;
	
	public Delivery(int year,int delivery,int distance,
		double pkgWeight){
		
		deliveryNumber=(year*10000)+delivery;
		distanceCode=distance;
		weight=pkgWeight;
		
		if(distance==1){
			if(weight<5)
				deliveryFee=12.00;
			if(weight>=5 && weight<=20)
				deliveryFee=16.50;
			if(weight>20)
				deliveryFee=22.00;
		}
		else
			deliveryFee=(weight<5)? 35.00: 47.95;
	}
	
	public void displayDelivery(){
		System.out.println("Delivery number "+deliveryNumber+
			", distance code "+distanceCode+", has a weight of "+
			weight+" pounds,\ngiving it a total delivery fee of $"+
			deliveryFee+".");
	}
}