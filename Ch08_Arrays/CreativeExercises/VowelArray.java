import java.util.Scanner;

public class VowelArray{
	public static void main(String[]args){
		String[]vowel={"a","e","i","o","u"};
		Scanner input=new Scanner(System.in);
		String data;
		int x;
		boolean check=false;
		
		System.out.println("Please enter a character.");
		data=input.nextLine();
		
		input.nextLine();
		
		for(x=0; x<vowel.length; x++)
			if(data.equals(vowel[x]))
				check=true;
		
		if(check)
			System.out.println("That IS a lower-case vowel.");
		else
			System.out.println("That is NOT a lower-case vowel.");
	}
}