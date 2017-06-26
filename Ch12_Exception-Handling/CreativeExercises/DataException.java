public class DataException extends Exception{
	private String message;
	
	public DataException(int num){
		setMessage(DataMessages.errorCode[num-1]);
	}
	
	private void setMessage(String s){
		message=s;
	}
	public String getMessage(){
		return message;
	}
}