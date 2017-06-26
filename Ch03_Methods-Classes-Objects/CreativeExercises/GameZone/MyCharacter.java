public class MyCharacter{
	private String attribute;
	private double powerPayout;
	private int health;
	
	public MyCharacter(){
		attribute="Normal";
		powerPayout=0.01;
		health=1;
	}
	
	public void setAttribute(String data){
		attribute=data;
	}
	public String getAttribute(){
		return attribute;
	}
	
	public void setPowerPayout(double num){
		powerPayout=num;
	}
	public double getPowerPayout(){
		return powerPayout;
	}
	
	public void setHealth(int num){
		health=num;
	}
	public int getHealth(){
		return health;
	}
}