import java.util.Scanner;

public class Salary{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your hourly pay rate: ");
		float payRate=input.nextFloat();
		
		System.out.print(
			"Enter the number of full regular hours you work for: ");
		int regHrs=input.nextInt();
		
		System.out.print(
			"Enter the number of full overtime hours you've worked for: ");
		int ovtHrs=input.nextInt();
		
		System.out.println("\nWith overtime pay, the week's salary is $"+
			ovtSalCalc(payRate,regHrs,ovtHrs)+".");
	}
	
	public static float ovtSalCalc(float hourly,int hrs, int ovt){
		float ovtSalary=hourly*hrs+hourly*ovt*1.5F;
		return ovtSalary;
	}
}