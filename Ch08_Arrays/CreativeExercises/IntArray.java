public class IntArray{
	public static void main(String[]args){
		int[]arr=new int[5];
		int x;
		int y;
		
		for(x=0; x<arr.length; x++){
			y=(int)Math.pow(x+1,2);
			arr[x]=y;
		}
		
		System.out.println("From first to last:");
		for(int t: arr)
			System.out.print(t+" ");
		
		System.out.println("\nFrom last to first:");
		while(x>0){
			x--;
			System.out.print(arr[x]+" ");
		}
	}
}