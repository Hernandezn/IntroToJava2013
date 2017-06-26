public class Prices{
	public static void main(String[]args){
		double[]price={ 2.34, 7.89, 1.34, 9.29,11.79, 7.22, 4.25, 6.95,
			13.27, 5.62, 3.33,  .68, 8.18,10.92, 5.43, 2.23,11.43,17.12,
			14.61,  .99};
		double sale=0.0;
		double avg;
		int x;
		
		for(double p: price)
			sale+=p;
		System.out.println("Sum of all prices: $"+sale+".\n");
		
		System.out.println("All prices less than $5.00:");
		for(x=0; x<price.length; x++)
			if(price[x]<5.0)
				System.out.print("$"+price[x]+" ");
		System.out.println("\n");
		
		avg=sale/price.length;
		System.out.println("The average of the prices is $"+avg+".\n");
		
		System.out.println("All prices higher than the average:");
		for(x=0; x<price.length; x++)
			if(price[x]>avg)
				System.out.print("$"+price[x]+" ");
	}
}