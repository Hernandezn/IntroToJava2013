public class InternationalDivision extends Division{
	private String country;
	private String language;
	
	public InternationalDivision(String name, String nation, String tongue, int num){
		super(name, num);
		country=nation;
		language=tongue;
	}
	
	public void display(){
		System.out.println("International division "+divisionName+", based in "+
			country+", deals in the "+language+" language and has account number "+
			accNum+".");
	}
}