import java.util.Scanner;

public class CarLoan extends PersonalLoan{
	private Scanner input=new Scanner(System.in);
	
	public CarLoan(){
		int data;
		
		setType("car");
		
		System.out.println("For how many years have you owned the car?");
		data=input.nextInt();
		
		if(data<=3)
			setRate(35);
		else if(data<=5)
			setRate(47.75);
		else if(data<=10)
			setRate(60);
		else
			setRate(87.50);
	}
	
	public String toString(){
		return("The loan is a "+getType()+" loan at a monthly rate of $"+getRate()+
			".");
	}
}