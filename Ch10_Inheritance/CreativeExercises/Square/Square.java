public class Square{
	protected int height;
	protected int length;
	protected int surfaceArea;
	
	public Square(int x, int y){
		height=x;
		length=y;
	}
	
	public void setHeight(int num){
		height=num;
	}
	public int getHeight(){
		return height;
	}
	
	public void setLength(int num){
		length=num;
	}
	public int getLength(){
		return length;
	}
	
	public int computeSurfaceArea(){
		surfaceArea=height*length;
		return surfaceArea;
	}
	public int getSurfaceArea(){
		return surfaceArea;
	}
}