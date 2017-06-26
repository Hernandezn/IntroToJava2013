public class UseTaxpayer2{
	public static void main(String[]args){
		Taxpayer[]worker=new Taxpayer[10];
		int income=0;
		int social=0;
		final int INCOME_INCREMENT=10000;
		int x;
		
//		for(Taxpayer t: worker)
//			t=new Taxpayer(0,999999999);
		
		for(x=0; x<worker.length; x++){
			income+=INCOME_INCREMENT;
			worker[x]=new Taxpayer(income,++social);
		}
		
		x=0;
		
		for(Taxpayer t: worker)
			System.out.println("Taxpayer "+(++x)+":\nGross yearly income "+
				"of $"+t.getYearlyGross()+" and SSN "+t.getSSN()+".\n");
	}
}