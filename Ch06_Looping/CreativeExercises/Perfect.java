public class Perfect{
	public static void main(String[]args){
		int num;
		int val;
		int count;
		final int LIMIT=1000;
		
		System.out.println("\"Perfect\" numbers are numbers whose "+
			"factors all add up to the number itself.\nFor example, "+
			"6 is perfect because its factors are 1, 2, and 3, which"+
			" add up to 6.\nAll perfect numbers from 1 to 1000 "+
			"are listed below:");
		
		for(num=1; num<=LIMIT; num++){
			count=0;
			for(val=1; val<num || val==1; val++)
				if(num%val == 0)
					count += val;
			if(count==num)
				System.out.print(num+" ");
		}
		
	}
}