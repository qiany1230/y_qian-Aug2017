/* Ying Qian
 * APCS1
 * February 23, 2018
 * Rectangular Prism subclass
 */

public class RectangularPrism extends Prism {
	
	private double length;
	private double width;
	
	public RectangularPrism(double height, double length, double width) {
		
		super(height);
		this.length = length;
		this.width = width;
	}
	
	public double calcAreaOfBase() {
		
		double areaOfBase = length * width;
		return areaOfBase;
	}
	
	public double calcPerimeter() {
		
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}

}

