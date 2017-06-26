import java.util.Scanner;

public class JavaArray{
	public static void main(String[]args){
		String[]reason={"It's open-ended enough to encapsulate nearly "+
			"every other art.","It's proven itself very capable with "+
			"applications like Minecraft and the Android OS.","WORA: Write"+
			" Once, Run Anywhere.","It's already made its mark with its "+
			"use in devices like cell phones, cars, and manufacturing.",
			"If you need a long task done, especially if more than once,\n"+
			"writing a program for it could save you some time."};
		Scanner input=new Scanner(System.in);
		int num;
		int x;
		boolean invalid=true;
		
		System.out.println("Enter a number 1 through 5, inclusive, for "+
			"one of my top reasons to use Java.");
		num=input.nextInt();
		
		for(x=0; x<reason.length; x++)
			if(x+1 == num){
				System.out.println(reason[x]);
				invalid=false;
			}
		
		if(invalid)
			System.out.println("That's not a valid reason number.");
	}
}