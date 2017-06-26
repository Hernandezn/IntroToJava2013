public class UseGeometric{
	public static void main(String[]args){
		GeometricFigure[]shapes={new Square(5, 7), new Triangle(9, 13)};
		
		for(int x=0; x<shapes.length; x++)
			shapes[x].display();
	}
}