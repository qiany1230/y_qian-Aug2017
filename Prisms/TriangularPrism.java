/* Ying Qian
 * APCS1
 * February 23, 2018
 * Triangular Prism subclass
 */

public class TriangularPrism extends Prism {
	
	private double sideA;
	private double sideB;
	private double sideC;

	public TriangularPrism(double height, double sideA, double sideB, double sideC) {
	
		super(height);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public double calcAreaOfBase() {
		
		double sum = calcPerimeter() * 0.5;
		double calcAreaOfBase = Math.sqrt(sum * (sum - sideA) * (sum - sideB) * (sum - sideC));
		return calcAreaOfBase;
	}
	
	public double calcPerimeter() {
		
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}
	
}
