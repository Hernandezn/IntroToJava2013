import java.util.Scanner;

public class Calculate{
	public static void main(String[]args){
		int num1;
		int num2;
		int selection;
		double ans=0;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your first integer: ");
		num1=input.nextInt();
		System.out.print("Enter your second integer: ");
		num2=input.nextInt();
		System.out.println("Enter an option for your operation:\n1 for "+
			"addition, 2 to subtract the second number from the  first,\n"+
			"3 for multiplication, or 4 to divide the first number by the"+
			" second.");
		selection=input.nextInt();
		
		if(selection==4 && num2==0)
			System.out.println("Divide-by-zero error! The application will"+
				" now terminate.");
		else{
			switch(selection){
				case 1:
					ans=num1+num2;
					break;
				case 2:
					ans=num1-num2;
					break;
				case 3:
					ans=num1*num2;
					break;
				case 4:
					ans=(double)num1/(double)num2;
					break;
				default:
					System.out.println("Error; you've entered an invalid "+
						"operation number. The application will terminate.");
					break;
			}
			if(selection==1 || selection==2 || selection==3
				|| selection==4)
				System.out.println("The answer is "+ans+".");
		}//arithmetic operation
	}
}