/* Ying Qian
 * APCS1
 * February 23, 2018
 * Cylinder subclass
 */

public class Cylinder extends Prism {
	
	private double radius;
	
	public Cylinder(double radius, double height) {
		
		super(height);
		this.radius = radius;
	}
	
<<<<<<< HEAD
	math.pi
	
=======
	public double calcAreaOfBase() {
		
		double areaOfBase = 3.14 * (radius * radius);
		return areaOfBase;
	}
	
	public double calcPerimeter() {
		
		double circumference = 2 * 3.14 * radius;
		return circumference;
	}

>>>>>>> branch 'master' of https://github.com/qiany1230/y_qian-Aug2017.git
}
