public abstract class Auto{
	protected String make;
	protected int price;
	
	public abstract void setPrice();
	
	public int getPrice(){
		return price;
	}
	
	public void setMake(String s){
		make=s;
	}
	public String getMake(){
		return make;
	}
}