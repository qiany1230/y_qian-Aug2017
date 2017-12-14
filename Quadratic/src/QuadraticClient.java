/* Ying Qian
 * Oct.17.2017
 * QuadraticClient and Quadratic
 */

import java.util.Scanner;

public class QuadraticClient{
	public static void main(String[] args) {

		double a;
		double b;
		double c;
		
		Scanner console = new Scanner(System.in);
	 	String end = console.nextLine();
		String endit = "quit";
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		
		a = console.nextDouble();
		b = console.nextDouble();
		c = console.nextDouble();
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		System.out.println("");
		System.out.println("Do you want to keep going? (Type \"quit\" to end");
			
		while (end == endit) {
			console.close();
		}
			
		 	
	}
}
