public class UseTaxpayer{
	public static void main(String[]args){
		Taxpayer[]worker=new Taxpayer[10];
		int x;
		
//		for(Taxpayer t: worker)
//			t=new Taxpayer(0,999999999);
		
		for(x=0; x<worker.length; x++)
			worker[x]=new Taxpayer(0,999999999);
		
		x=0;
		
		for(Taxpayer t: worker)
			System.out.println("Taxpayer "+(++x)+":\nGross yearly income "+
				"of $"+t.getYearlyGross()+" and SSN "+t.getSSN()+".\n");
	}
}