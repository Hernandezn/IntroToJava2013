public class OrderException extends Exception{
	
	public OrderException(int num){
		super(OrderMessages.errorCode[num-1]);
	}
}