import java.util.Scanner;

public class Majors{
	enum Major{ACC, CHEM, CIS, ENG, HIS, PHYS};
	
	public static void main(String[]args){
		Major[]array=Major.values();
		Scanner input=new Scanner(System.in);
		int x;
		String entry;
		Major m;
		boolean b=false;
		
		System.out.println("The offered majors are as follows:");
		for(Major maj: array)
			System.out.print(maj+" ");
		System.out.println();
		
		do{
		System.out.print("Please enter a major > ");
		entry=input.nextLine().toUpperCase();
		
		for(Major maj: array)
			if(maj.toString().equals(entry))
				b=true;
		
		if(!b)
			System.out.println("Invalid entry.");
		}while(!b);
		
		m=Major.valueOf(entry);
		switch(m){
			case ACC:
			case CIS:
				System.out.println("Your major "+m+" is in the Business division.");
				break;
			case CHEM:
			case PHYS:
				System.out.println("Your major "+m+" is in the Science division.");
				break;
			case ENG:
			case HIS:
				System.out.println("Your major "+m+" is in the Humanities division.");
		}
	}
}