/* Ying Qian
 * APCS1
 * February 23, 2018
 * ThreeDShape subclass
 */

//Create a new class called ThreeDShape. Start with the code below. Complete it and adjust your other code to accommodate it. Write a Sphere class.

public class ThreeDShape {
	
	private double volume;
	private double surfaceArea;

	public ThreeDShape() {
		
		this.volume = calcVolume();
		this.surfaceArea = calcSA();
	}

// Can you write this code for this class or does it need to be overridden by every subclass?
	public double calcVolume() {
		
		return 0;
	}

// Can you write this code for this class or does it need to be overridden by every subclass?
	public double calcSA() {
	
		return 0;
	}
	
}