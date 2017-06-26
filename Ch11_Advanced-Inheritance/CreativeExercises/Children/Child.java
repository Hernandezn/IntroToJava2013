public abstract class Child{
	protected String name;
	protected String gender;
	protected int age;
	
	public abstract void setAge();
	public abstract void display();
	
	public Child(String s, String sex){
		name=s;
		gender=sex;
	}
}