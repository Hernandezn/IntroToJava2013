import java.util.Scanner;

public class Quiz{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int upCount=0;
		int downCount=0;
		int ans1, ans2, ans3, ans4, ans5;
		double percentCorrect;
		final int NUMBER_OF_QUESTIONS=5;
		
		System.out.println("Astronomy quiz~");
		
		System.out.println("\nWhat will be the last stage of the "+
			"Sun's life?\n(1)Supernova (2)Red Giant (3)White Dwarf"+
			" (4)Black Hole");
		ans1=input.nextInt();
		
		if(ans1!=3){
			System.out.println("Nope! The Sun will turn into a "+
				"red giant before dispersing silently\n(without a "+
				"supernova), leaving its collapsed core as a\n"+
				"super-dense white dwarf for the rest of its days.");
			downCount++;
		}
		else{
			System.out.println("That's right!");
			upCount++;
		}
		
		System.out.println("\nThe Milky Way is a spiral galaxy, but"+
			" what specific type of spiral galaxy is it?\n(1)Barred"+
			" Spiral (2)Regular Spiral (3)Hybrid Spiral (4)"+
			"Unspecified/Unknown");
		ans2=input.nextInt();
		
		if(ans2!=4){
			System.out.println("Since we can only see the Milky Way "+
				"from the inside,\nscientists aren't quite sure what "+
				"type of spiral the Milky Way is.");
			downCount++;
		}
		else{
			System.out.println("Congratulations! You got it right.");
			upCount++;
		}
		
		System.out.println("\nThe largest moon in the Solar System "+
			"is...\n(1)Titan (2)Ganymede (3)Earth's Moon (4)Triton");
		ans3=input.nextInt();
		
		if(ans3!=2){
			System.out.println("The largest moon in the Solar System"+
				" is Jupiter's Ganymede.\nIn fact, it was one of the "+
				"first non-earthbound satellites found by Galileo\n"+
				"using fiercely limited telescopes centuries ago.");
			downCount++;
		}
		else{
			System.out.println("You got that one right~");
			upCount++;
		}
		
		System.out.println("\nAmong these, what color of star would "+
			"be the hottest?\n(1)White (2)Blue (3)Red (4)Yellow");
		ans4=input.nextInt();
		
		if(ans4!=1){
			System.out.println("White-hot stars are the hottest.\n"+
				"Red is actually the lowest-energy (visible) light "+
				"that can be given off,\nso stars that give off red"+
				", orange, or yellow light actually burn with less "+
				"intensity than, say, blue stars.\nWhite light "+
				"includes all visible light colors, so white-hot "+
				"stars are actually emitting\nall visible colors "+
				"at once by burning with the highest intensities "+
				"out of all the stars listed.");
			downCount++;
		}
		else{
			System.out.println("Swing and a hit! You got this one.");
			upCount++;
		}
		
		System.out.println("\nWhich of these celestial bodies is the"+
			" most dense?\n(1)White Dwarf Star (2)Comet (3)Neutron "+
			"Star (4)Supernova");
		ans5=input.nextInt();
		
		if(ans5!=3){
			System.out.println("The densest of these is the neutron "+
				"star. It's actually an\nentire star (imagine "+
				"something as massive as the sun, if not bigger)\n"+
				"all packed into something the size of a city. It's "+
				"so unimaginably dense that\nthe protons and "+
				"electrons in its atoms get fused into neutrons,\nso "+
				"dense that dropping a marshmallow onto it would "+
				"release the energy of a nuclear bomb.");
			downCount++;
		}
		else{
			System.out.println("Correct! It looks like you know your"+
				" stuff.");
			upCount++;
		}
		
		percentCorrect=100*
			((double)upCount/(double)NUMBER_OF_QUESTIONS);
		
		System.out.println("\nYou got "+upCount+" questions correct "+
			"and "+downCount+" questions incorrect. Your percentage"+
			" score is "+percentCorrect+"%.");
	}
}