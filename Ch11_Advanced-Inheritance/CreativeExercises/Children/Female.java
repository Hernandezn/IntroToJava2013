import java.util.Scanner;

public class Female extends Child{
	private Scanner input=new Scanner(System.in);
	
	public Female(String s){
		super(s, "female");
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