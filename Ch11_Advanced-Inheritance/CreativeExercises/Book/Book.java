public abstract class Book{
	protected String title;
	protected double price;
	
	public abstract void setPrice();
	
	public Book(String s){
		title=s;
	}
	
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
}