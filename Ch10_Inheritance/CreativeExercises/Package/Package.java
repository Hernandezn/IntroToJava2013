public class Package{
	private int ounces;
	private char shipment;
	protected double cost;
	
	public Package(int num, char c){
		ounces=num;
		shipment=c;
		
		cost=calculateCost(ounces, shipment);
	}
	private double calculateCost(int num, char c){
		int[]weight={17, 9, 1};
		char[]type={'A','T','M'};
		double[][]price={	{4.50,3.25,2.15},
								{3.00,2.35,1.50},
								{2.00,1.50, .50}};
		int x, y;
		cost=0;
		
		for(x=0; x<weight.length; x++)
			if(num>=weight[x]){
				for(y=0; y<type.length; y++)
					if(c==type[y])
						cost=price[x][y];
			x=weight.length;
			}
		
		return cost;
	}
	
	public void display(){
		System.out.println("Your package is "+ounces+" ounces, being delivered by "+
			"method type "+shipment+", totalling $"+cost+".");
	}
}