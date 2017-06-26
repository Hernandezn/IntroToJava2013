import java.util.Scanner;

public class UsePackage{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		char c, i;
		boolean b=false;
		int num;
		Package pkg=new Package(0,'z');
		InsuredPackage pck=new InsuredPackage(0,'z');
		boolean insured=false;
		
		System.out.print("Enter the weight of your package in ounces > ");
		num=input.nextInt();
		
		input.nextLine();
		
		do{
			System.out.print("Would you like it shipped by air, truck, or mail? ");
			c=Character.toUpperCase(input.nextLine().charAt(0));
			
			if(c=='M')
				b=true;
			else if(c=='T')
				b=true;
			else if(c=='A')
				b=true;
		}while(!b);
		b=false;
		
		do{
			System.out.print("Would you like to insure your package? ");
			i=input.nextLine().charAt(0);
			
			if(i=='N' || i=='n'){
				pkg=new Package(num, c);
				b=true;
			}
			else if(i=='Y' || i=='y'){
				pck=new InsuredPackage(num, c);
				insured=true;
				b=true;
			}
		}while(!b);
		
		if(insured)
			pck.display();
		else
			pkg.display();
	}
}