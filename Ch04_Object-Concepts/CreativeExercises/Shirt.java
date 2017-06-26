public class Shirt{
	private int collarSize,sleeveLength;
	final static String MATERIAL="cotton";
	
	public Shirt(int size,int length){
		collarSize=size;
		sleeveLength=length;
	}
	
	public int getCollarSize(){
		return collarSize;
	}
	public int getSleeveLength(){
		return sleeveLength;
	}
	public String getMaterial(){
		return MATERIAL;
	}
}