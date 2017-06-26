public class Builder{
	public static void main(String[]args){
		StringBuilder firstName=new StringBuilder("Kazmir");
		StringBuilder midName=new StringBuilder("Amelius");
		StringBuilder lastName=new StringBuilder("Runik");
		StringBuilder entireName;
		StringBuilder lastFirst;
		StringBuilder signature;
		
		entireName=new StringBuilder(firstName+" "+midName+" "+lastName);
		
		lastFirst=new StringBuilder(lastName+", "+firstName);
		
		signature=new StringBuilder(firstName+" "+midName.charAt(0)+". "+
			lastName);
		
		System.out.println("StringBuilder object values:\nfirstName -- "+
			firstName+"\nmidName -- "+midName+"\nlastName -- "+lastName+
			"\n\nentireName -- "+entireName+"\nlastFirst -- "+lastFirst+
			"\nsignature -- "+signature);
	}
}