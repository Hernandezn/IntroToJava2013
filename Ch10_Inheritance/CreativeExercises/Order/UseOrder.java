public class UseOrder{
	public static void main(String[]args){
		Order bulb=new Order();
		ShippedOrder lcd=new ShippedOrder();
		
		System.out.println("Light bulbs have been ordered from inhouse.");
		bulb.setName();
		bulb.setNumber();
		bulb.setQuantity();
		bulb.setUnitPrice();
		bulb.computePrice();
		bulb.display();
		
		System.out.println();
		System.out.println("LCD lights aren't in stock, so we'll have them shipped.");
		lcd.setName();
		lcd.setNumber();
		lcd.setQuantity();
		lcd.setUnitPrice();
		lcd.computePrice();
		lcd.display();
	}
}