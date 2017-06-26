public class UseDivision{
	public static void main(String[]args){
		InternationalDivision intl=new InternationalDivision("Runiqua", "India",
			"Hindi", 5235);
		DomesticDivision inhouse=new DomesticDivision("Times", "Texas", 4123);
		
		intl.display();
		System.out.println();
		inhouse.display();
	}
}