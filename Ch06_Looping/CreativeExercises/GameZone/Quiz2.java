import java.util.Scanner;

public class Quiz2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int ans1, ans2, ans3, ans4, ans5;
		
		System.out.println("Astronomy quiz~");
		
		do{
			System.out.println("\nWhat will be the last stage of the "+
				"Sun's life?\n(1)Supernova (2)Red Giant (3)White Dwarf"+
				" (4)Black Hole");
			ans1=input.nextInt();
			if(ans1!=3)
				System.out.println("Nope! Try again.");
		}while(ans1!=3);
		
		System.out.println("That's right!");
		
		do{		
			System.out.println("\nThe Milky Way is a spiral galaxy, but"+
				" what specific type of spiral galaxy is it?\n(1)Barred"+
				" Spiral (2)Regular Spiral (3)Hybrid Spiral (4)"+
				"Unspecified/Unknown");
			ans2=input.nextInt();
		
			if(ans2!=4)
				System.out.println("Keep trying.");
		}while(ans2!=4);
		
		System.out.println("Congratulations! You got it right.");
		
		do{
			System.out.println("\nThe largest moon in the Solar System "+
				"is...\n(1)Titan (2)Ganymede (3)Earth's Moon (4)Triton");
			ans3=input.nextInt();
			
			if(ans3!=2)
				System.out.println("Guess again, grasshopper.");
		}while(ans3!=2);
		
		System.out.println("You got that one right~");
		
		do{
			System.out.println("\nAmong these, what color of star would "+
				"be the hottest?\n(1)White (2)Blue (3)Red (4)Yellow");
			ans4=input.nextInt();
			
			if(ans4!=1)
				System.out.println("Swing and a miss.");
		}while(ans4!=1);
		
		System.out.println("Swing and a hit! You got this one.");
		
		do{
			System.out.println("\nWhich of these celestial bodies is the"+
				" most dense?\n(1)White Dwarf Star (2)Comet (3)Neutron "+
				"Star (4)Supernova");
			ans5=input.nextInt();
			
			if(ans5!=3)
				System.out.println("Why don't you take another shot "+
					"at this?");
		}while(ans5!=3);
		
		System.out.println("Correct!");
				
		System.out.println("\nYou got 'em all. Took ya long enough.");
	}
}