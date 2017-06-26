public class Order{
	private int orderNum;
	private String customer;
	private String address;
	public int[]itemsOrdered;
	private double totalPrice;
	private double shippingFee;
	private String[]itemDescriptions;
	private double[]itemPrices;
	
	private int[]itemID={101,124,256,512};
	private String[]item={"Electric hand warmer","Battery-operated plant waterer",
		"Gerbil trimmer","Talking bookmark"};
	private double[]cost={12.99,7.55,9.99,6.89};
	
	public Order(int order, String name, String address, int x, int y, int z, int t,
		int qx, int qy, int qz, int qt){
		int items=0;
		int[]array={x, y, z, t};
		int[]count={qx,qy,qz,qt};
		int i, o;
		double price=0;
		
		orderNum=order;
		customer=name;
		this.address=address;
		for(i=0; i<4; i++)
			if(array[i]>=0)
				items++;
			else
				i=4;
		itemsOrdered=new int[items];
		itemDescriptions=new String[items];
		itemPrices=new double[items];
		
		for(i=0; i<items; i++)
			itemsOrdered[i]=array[i];
		
		for(i=0; i<items; i++)
			for(o=0; o<itemID.length; o++)
				if(itemsOrdered[i]==itemID[o]){
					price+=cost[o]*count[i];
					itemDescriptions[i]=item[o];
					itemPrices[i]=cost[o];
				}
		totalPrice=price;
		
		if(price>=50.0)
			shippingFee=11.55;
		else if(price>=25.0)
			shippingFee=8.55;
		else
			shippingFee=5.55;
	}
	
	public int getOrderNumber(){
		return orderNum;
	}
	public String getCustomerName(){
		return customer;
	}
	public String getAddress(){
		return address;
	}
	public int getItemOrdered(int num){
		return itemsOrdered[num];
	}
	public String getItemDescription(int num){
		return itemDescriptions[num];
	}
	public double getItemPrice(int num){
		return itemPrices[num];
	}
	public double getTotalPrice(){
		return totalPrice;
	}
	public double getShippingAndHandling(){
		return shippingFee;
	}
}