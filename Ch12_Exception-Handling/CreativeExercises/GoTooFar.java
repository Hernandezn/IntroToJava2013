public class GoTooFar{
	public static void main(String[]args){
		int[]nums={1, 2, 3, 4, 5};
		int x=0;
		boolean b=true;
		
		try{
			while(b){
				System.out.println(nums[x]);
				x++;
			}
		}
		catch(ArrayIndexOutOfBoundsException error){
			System.out.println("Now you've gone too far.");
		}
	}
}