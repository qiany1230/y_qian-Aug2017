/* Ying Qian
 * September 5,2017
 * This is our home grown library that will contain various mathematical method.
 */

public class Calculate {

/* This method takes an integer and returns its square. 
 */
	public static int square(int operand) {
		int squared=operand * operand;
		return squared;
	}
	
/* This method takes an integer and returns its cube.
 */
	public static int cube(int operand) {
		int cubed=operand * operand * operand;
		return cubed;
	}
	
/* This method takes two doubles and returns a double.
 */
	public static double average(double operand) {
		double average=(operand + operand)/2;
		return average;
	}
}
