public class InsuredPackage extends Package{
	
	public InsuredPackage(int num, char c){
		super(num, c);
		
		double[]price={3.00,1.00,0};
		double[]insurance={5.55,3.95,2.45};
		int x;
		
		for(x=0; x<price.length; x++)
			if(cost>price[x]){
				cost+=insurance[x];
				x=price.length;
			}
	}
}