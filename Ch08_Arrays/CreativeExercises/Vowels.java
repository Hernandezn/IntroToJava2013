public class Vowels{
	public static void main(String[]args){
		String[]family={"Michael","Gloria","Valarie","Jessica","Miranda"};
		String[]vowel={"A","E","I","O","U"};
		int x;
		int count=0;
		
		for(String f: family)
			for(x=0; x<f.length(); x++)
				for(String v: vowel)
					if(v.equalsIgnoreCase(f.charAt(x)+""))
						count++;
		
		System.out.println("There are "+count+" total vowels in the "+
			"entered family members' names.");
	}
}