import java.util.Scanner;

public class Schedule{
	public static void main(String[]Args){
		String[][]courses={	{"CMPS 1110","MATH 2112","ENGL 2011","HUMN 1301"},
									{"Tues 9:20","Mon 10:50","Thur 3:05","Wed 12:15"}};
		Scanner input=new Scanner(System.in);
		int x;
		boolean b=false;
		int pos=0;
		String name;
		
		do{
		System.out.print("Please enter a course name > ");
		name=input.nextLine();
		
		for(x=0; x<courses[0].length; x++)
			if(name.equalsIgnoreCase(courses[0][x])){
				pos=x;
				b=true;
			}
		
		if(!b)
			System.out.println("Invalid course.");
		}while(!b);
		
		System.out.println("Course "+courses[0][pos]+" begins at "+courses[1][pos]+
			".");
	}
}