public class OrderException extends Exception{
	private String[]errorCode={"You've tried ordering too many items.",
		"You can't order more than 100 of an item.","That's an invalid item number."};
	private String message;
	
	public OrderException(int x){
		setMessage(x);
	}
	
	private void setMessage(int x){
		message=errorCode[x-1];
	}
	public String getMessage(){
		return message;
	}
}