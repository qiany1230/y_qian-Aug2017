/* Ying Qian
 * APCS1
 * February 23, 2018
 * Prism class
 */

public abstract class Prism {
	
	private double height;
	
	public Prism(double height) {
		
		this.height = height;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	public abstract double calcAreaOfBase();
	public abstract double calcPerimeter();
	
	public double calcVolume() {
		
		double volume = calcAreaOfBase() * height;
		return volume;
	}
	
	public double calcSA() {
		
		return (calcPerimeter() * height) + (2 * calcAreaOfBase());
	}
		
}
	