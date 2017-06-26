import java.util.Scanner;

public class CreateLoans{
	public static void main(String[]args){
		Loan[]loans=new Loan[5];
		Scanner input=new Scanner(System.in);
		double rate;
		String name;
		int loanNum;
		double loanAmt;
		int duration;
		String type;
		boolean b;
		
		System.out.print("Please enter the prime interest rate percentage > ");
		rate=input.nextDouble();
		input.nextLine();
		
		for(int x=0; x<loans.length; x++){
			b=false;
			
			System.out.print("Enter the loan recipient's name > ");
			name=input.nextLine();
			
			System.out.print("Enter the loan number > ");
			loanNum=input.nextInt();
			
			System.out.print("Enter the loan amount > ");
			loanAmt=input.nextDouble();
			
			System.out.println("How many years will you sustain this loan?\nWe deal "+
				"in 1-year, 3-year, and 5-year loans only.");
			duration=input.nextInt();
			input.nextLine();
			
			do{
				System.out.println("Would you like to take out a personal loan or a "+
					"business loan?");
				type=input.nextLine().charAt(0)+"";
				
				if(type.equalsIgnoreCase("b")){
					b=true;
					loans[x]=new BusinessLoan(rate, name, loanNum, loanAmt, duration);
				}
				else if(type.equalsIgnoreCase("p")){
					b=true;
					loans[x]=new PersonalLoan(rate, name, loanNum, loanAmt, duration);
				}
			}while(!b);
		}
		
		for(int x=0; x<loans.length; x++)
			System.out.println(loans[x].toString()+"\n");
	}
}