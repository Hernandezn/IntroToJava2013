import java.util.Scanner;

public class Male extends Child{
	private Scanner input=new Scanner(System.in);
	
	public Male(String s){
		super(s, "male");
		setAge();
		display();
	}
	
	public void setAge(){
		System.out.print("Please enter the child's age > ");
		age=input.nextInt();
	}
	
	public void display(){
		System.out.println("The child, "+name+", is a "+gender+" of age "+age+".");
	}
}