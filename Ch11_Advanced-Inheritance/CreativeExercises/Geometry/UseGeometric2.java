public class UseGeometric2{
	public static void main(String[]args){
		GeometricFigure2[]shapes={new Square2(5, 7), new Triangle2(9, 13)};
		
		for(int x=0; x<shapes.length; x++)
			shapes[x].display();
	}
}