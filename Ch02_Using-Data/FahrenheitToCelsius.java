import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String[]args){
		Scanner fahrenheit=new Scanner(System.in);
		System.out.print(
			"Enter a fahrenheit temperature value to be converted to celsius: ");
		float degreesFa=fahrenheit.nextFloat();
		float degreesCe=(degreesFa-32F)*(5F/9F);
		System.out.print(degreesFa+" degrees fahrenheit converts into "
			+degreesCe+" degrees celsius.");
	}
}