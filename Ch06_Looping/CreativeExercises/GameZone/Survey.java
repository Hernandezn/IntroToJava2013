import java.util.Scanner;

public class Survey{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int ans1, ans2, ans3, ans4;
		int count1a=0, count1b=0, count1c=0;
		int count2a=0, count2b=0, count2c=0;
		int count3a=0, count3b=0, count3c=0;
		int count4a=0, count4b=0, count4c=0;
		int selection;
		
		do{
			System.out.println("What political party do you "+
				"associate yourself with?\n1)Rep 2)Dem 3)Independent");
			ans1=input.nextInt();
			switch(ans1){
				case 1:
					++count1a;
					break;
				case 2:
					++count1b;
					break;
				case 3:
					++count1c;
					break;
				default:;
			}
			System.out.println("What age range do you fall into?\n"+
				"(1)under 30 (2)30 to 49 (3)50 or older");
			ans2=input.nextInt();
			switch(ans2){
				case 1:
					++count2a;
					break;
				case 2:
					++count2b;
					break;
				case 3:
					++count2c;
					break;
				default:;
			}
			System.out.println("What is your level of education?\n"+
				"(1)less than high school (2)high school diploma/GED "+
				"(3)college degree holder");
			ans3=input.nextInt();
			switch(ans3){
				case 1:
					++count3a;
					break;
				case 2:
					++count3b;
					break;
				case 3:
					++count3c;
					break;
				default:;
			}
			System.out.println("What is your religious leaning?\n"+
				"1)Judeo-Christian 2)Eastern/Indian 3)unspecified"+
				"/native");
			ans4=input.nextInt();
			switch(ans4){
				case 1:
					++count4a;
					break;
				case 2:
					++count4b;
					break;
				case 3:
					++count4c;
					break;
				default:;
			}
			System.out.println("Do you want to (1)allow another "+
				"copy of this survey to be filled out or (2)quit "+
				"and see the results?");
			selection=input.nextInt();
		}while(selection==1);
		
		System.out.println("For political parties, "+count1a+
			" chose republican, "+count1b+" chose democrat, and "+
			count1c+" chose independent.\n");
		System.out.println("As for age ranges, "+count2a+
			" were below 30, "+count2b+" were ages 30 to 49, and "+
			count2c+" were ages 50 and above.\n");
		System.out.println("The educational levels included "+
			count3a+" under high school level education, "+count3b+
			" with a high school diploma or\nequivalent, and "+
			count3c+" participants with college degrees.\n");
		System.out.println("Religious demographics broke down into "+
			count4a+" Judeo-Christian members, "+count4b+" people "+
			"belonging to Eastern/Indian\nreligions, and "+count4c+
			" people outside of the listed religious mainstreams.");
	}
}