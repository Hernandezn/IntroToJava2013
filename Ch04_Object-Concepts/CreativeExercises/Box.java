public class Box{
	private int length,width,height;
	
	public Box(int x){
		length=x;
		width=0;
		height=0;
		
		System.out.println("Line segment of "+length+" units created.");
	}
	public Box(int x,int y){
		length=x;
		width=y;
		height=0;
		
		System.out.println(length+" by "+width+" rectangle created.");
	}
	public Box(int x,int y,int z){
		length=x;
		width=y;
		height=z;
		
		System.out.println(length+"x"+height+"x"+width+" box created.");
	}
}