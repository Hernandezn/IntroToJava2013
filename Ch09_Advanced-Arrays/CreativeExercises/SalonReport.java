import java.util.Scanner;

public class SalonReport{
	public static void main(String[]args){
		Service[]services=new Service[6];
		Scanner input=new Scanner(System.in);
		int x;
		String entry;
		String data;
		boolean b=false;
		
		services[0]=new Service("Cut",		8,	15);
		services[1]=new Service("Shampoo",	4,	10);
		services[2]=new Service("Manicure",	18,30);
		services[3]=new Service("Style",		48,55);
		services[4]=new Service("Permanent",18,35);
		services[5]=new Service("Trim",		6,	5);
		
		do{
			System.out.println("What is your preferred sort order: service type, price, "+
				"or time in minutes?");
			entry=input.nextLine();
			
			data=entry.charAt(0)+"";
			if(data.equalsIgnoreCase("S") || data.equalsIgnoreCase("P") ||
				data.equalsIgnoreCase("T"))
				b=true;
			else
				System.out.println("Invalid entry.");
		}while(!b);
		
		if(data.equalsIgnoreCase("S"))
			serviceSort(services);
		else if(data.equalsIgnoreCase("P"))
			priceSort(services);
		else if(data.equalsIgnoreCase("T"))
			timeSort(services);
		
		System.out.println("Sorted, the services are:");
		for(x=0; x<services.length; x++)
			System.out.println(services[x].getSvc()+" at $"+services[x].getPrice()
				+" in approx. "+services[x].getTime()+" minutes");
	}//main
	
	public static void serviceSort(Service[]array){
		int x, y;
		Service temp;
		int limit=array.length-1;
		int comparison;
		
		for(x=0; x<limit; x++)
			for(y=0; y<limit-x; y++){
				comparison=array[y].getSvc().compareTo(array[y+1].getSvc());
				if(comparison>0){
					temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
			}
	}//svcSort
	public static void priceSort(Service[]array){
		int x, y;
		Service temp;
		int limit=array.length-1;
		
		for(x=0; x<limit; x++)
			for(y=0; y<limit-x; y++)
				if(array[y].getPrice() > array[y+1].getPrice()){
					temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
	}//priceSort
	public static void timeSort(Service[]array){
		int x, y;
		Service temp;
		int limit=array.length-1;
		
		for(x=0; x<limit; x++)
			for(y=0; y<limit-x; y++)
				if(array[y].getTime() > array[y+1].getTime()){
					temp=array[y];
					array[y]=array[y+1];
					array[y+1]=temp;
				}
	}//timeSort
}