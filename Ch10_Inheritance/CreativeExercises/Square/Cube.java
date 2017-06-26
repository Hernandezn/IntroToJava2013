public class Cube extends Square{
	private int depth;
	
	public Cube(int x, int y, int z){
		super(x, y);
		depth=z;
	}
	
	public void setDepth(int num){
		depth=num;
	}
	public int getDepth(){
		return depth;
	}
	
	public int computeSurfaceArea(){
		surfaceArea=(2*height*length)+(2*height*depth)+(2*length*depth);
		return surfaceArea;
	}
	public int getSurfaceArea(){
		return surfaceArea;
	}
}