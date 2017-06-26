public abstract class GeometricFigure{
	protected int height;
	protected int length;
	protected String type;
	protected double area;
	
	public abstract void setArea();
	public abstract void display();
	
	public void setLength(int num){
		length=num;
	}
	public int getLength(){
		return length;
	}
	
	public void setHeight(int num){
		height=num;
	}
	public int getHeight(){
		return height;
	}
	
	public void setType(String s){
		type=s;
	}
	public String getType(){
		return type;
	}
	
	public double getArea(){
		return area;
	}
}