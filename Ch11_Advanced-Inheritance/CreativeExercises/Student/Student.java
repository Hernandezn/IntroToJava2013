public abstract class Student{
	protected String name;
	protected boolean fullTime;
	protected int tuition;
	
	public abstract void setTuition();
	
	public int getTuition(){
		return tuition;
	}
	
	public void setName(String s){
		name=s;
	}
	public String getName(){
		return name;
	}
}