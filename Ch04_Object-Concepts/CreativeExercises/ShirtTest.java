public class ShirtTest{
	public static void main(String[]args){
		Shirt first=new Shirt(0,18);
		Shirt second=new Shirt(2,16);
		Shirt third=new Shirt(1,14);
		
		System.out.println("The first shirt, material "+first.getMaterial()
			+", has a collar length of "+first.getCollarSize()+
			" inch(es) and a sleeve length of "+first.getSleeveLength()+
			" inches.\n");
		System.out.println("The second shirt, material "+
			second.getMaterial()+", has a collar length of "+
			second.getCollarSize()+" inch(es) and a sleeve length of "+
			second.getSleeveLength()+" inches.\n");
		System.out.println("the third shirt, material "+third.getMaterial()
			+", has a collar length of "+third.getCollarSize()+
			" inch(es) and a sleeve length of "+third.getSleeveLength()+
			" inches.");
	}
}