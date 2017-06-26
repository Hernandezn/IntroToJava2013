public class Fiction extends Book{
	
	public Fiction(String s){
		super(s);
		setPrice();
	}
	
	public void setPrice(){
		price=24.99;
	}
}