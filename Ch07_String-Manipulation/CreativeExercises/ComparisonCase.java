public class ComparisonCase{
	public static void main(String[]args){
		String nameA="Varus von Sanders";
		String name1="Varus Von Sanders";
		boolean comparisonA=nameA.equals(name1);
		boolean comparison1=name1.equalsIgnoreCase(name1);
		
		System.out.println("Name A is "+nameA+", and name 1 is "+name1+
			".");
		
		System.out.println("Because the case differs, comparing them with"+
			" the .equals() method results in an output of "+comparisonA+
			",\nand comparing them with .equalsIgnoreCase() outputs "+
			comparison1+".");
	}
}