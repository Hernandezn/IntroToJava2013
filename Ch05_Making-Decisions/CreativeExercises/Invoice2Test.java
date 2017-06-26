public class Invoice2Test{
	public static void main(String[]args){
		Invoice2 x=new Invoice2(3745,500,7,15,2014);//all correct
		Invoice2 y=new Invoice2(286,49.95,19,31,2012);
			//invoice num, month, and day=0
		Invoice2 z=new Invoice2(64253,0,1,1,1);//year and balance=0
		Invoice2 ace=new Invoice2(4352,1250,12,13,2019);//year=0
		Invoice2 uno=new Invoice2(1000,299.99,-3,52,2017);//month and day=0
		Invoice2 one=new Invoice2(2759,50000,2,31,2012);//day=29
		Invoice2 alpha=new Invoice2(3254,-9.95,2,31,2014);//day=28
		Invoice2 end=new Invoice2(31,999.95,4,31,2013);
			//invoice num and day=30
		
		x.display();
		y.display();
		z.display();
		ace.display();
		uno.display();
		one.display();
		alpha.display();
		end.display();
	}
}