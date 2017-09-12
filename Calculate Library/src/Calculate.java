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
/* This method takes three doubles and returns a double.
 
	public static double average( operand) {
		double average;
		average=(operand )/3;
		return average;
	}*/
/* This method takes an angle measure given in radians into degrees. double=>double
 */
	public static double toDegrees(double operand) {
		double toDegrees=180/(operand*3.14159);
		return toDegrees;
	}
/* This method takes an angle measure given in degrees into radians. double=>double
 */
	public static double toRadians(double operand) {
		double toRadians=180/(operand*3.14159);
		return toRadians;
	}
/* This method takes three doubles and returns a double.
 */
	public static double discriminant(double a, double b, double c) {
		double discriminant=a+b+c;
		return discriminant;
	}
/* This method takes three integers and returns a String.
 */
	public static int toImproperFrac(int a, int b, int c) {
		int toImproperFrac=a*c+1/c;
		return toImproperFrac;
	}
/* This method takes two integers and returns a String.
 */
	public static int toMixedNum(int a, int b) {
		int toMixNum=a/b_a%b;
		return toMixNum;
	}
/* This method takes four integers and returns a String.
 */
	public static int foil(int a, int b, int c, int d,"n") {
		int foil=a*c"n"+(a*d-b*c)+b*d;
		return foil;
	}
/* This method takes two integers and returns a boolean.
 */
	public static boolean isDivisibleBy(int a, int b) {
		return a%b==0;
	}
/* This method takes a double and returns a double.
 */
	public static double absValue(double operand) {
		double absValue=operand;
		return absValue;
	}
/* This method takes two doubles and returns a double.
 */
/*	public static double max(double a, double b) {
		if a<=b;
		return */
}
