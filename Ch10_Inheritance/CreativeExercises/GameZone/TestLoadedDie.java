public class TestLoadedDie{
	public static void main(String[]args){
		Die one=new Die();
		Die two=new Die();
		int x;
		int count=0;
		
		for(x=0; x<1000; x++)
			if(one.rerollReturn()>two.rerollReturn())
				count++;
		
		System.out.println("With two regular dice, the first die won "+count+
			" times out of 1000.");
		
		count=0;
		LoadedDie three=new LoadedDie();
		
		for(x=0; x<1000; x++)
			if(one.rerollReturn()>three.rerollReturn())
				count++;
		
		System.out.println("With one die and one loaded die, the first die won "+count
			+" times out of 1000.");
	}
}