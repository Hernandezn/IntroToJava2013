public class InvoiceTest{
	public static void main(String[]args){
		Invoice x=new Invoice(3745,500,7,15,2014);//all correct
		Invoice y=new Invoice(286,49.95,19,31,2012);//invoice num & month=0
		Invoice z=new Invoice(64253,0,1,1,1);//year=0
		Invoice ace=new Invoice(4352,1250,12,13,2019);//year=0
		Invoice uno=new Invoice(1000,299.99,-3,52,2017);//month & day=0
		
		x.display();
		y.display();
		z.display();
		ace.display();
		uno.display();
	}
}