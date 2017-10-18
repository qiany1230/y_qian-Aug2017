/* Ying Qian
 * Oct.17.2017
 * QuadraticClient and Quadratic
 */

import java.util.Scanner;

public class QuadraticClient{
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		double a = console.nextDouble();
		double b = console.nextDouble();
		double c = console.nextDouble();
		
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		
			System.out.println("a:" + a);
			System.out.println("b:" + b);
			System.out.println("c:" + c);
		
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("");
			System.out.println("Do you want to keep going? (Type \"quit\" to end");

		console.close();
	}
}














