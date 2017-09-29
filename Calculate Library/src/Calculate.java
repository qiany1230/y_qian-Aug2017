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
 */
	public static double average(double a, double b, double c) {
		double average;
		average=(a+b+c)/3;
		return average;
	}
/* This method takes an angle measure given in radians into degrees. double=>double
 */
	public static double toDegrees(double operand) {
		double toDegrees=(operand*180)/3.14159;
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
		double discriminant=(b*b) - (4*a*c);
		return discriminant;
	}
/* This method takes three integers and returns a String.
 */
	public static String toImproperFrac(int a, int b, int c) {
		int d= (a*c)+b;
		String toImproperFrac=d + "/" + c;
		return toImproperFrac;
	}
/* This method takes two integers and returns a String.
 */
	public static String toMixedNum(int a, int b) {
		int whole = a/b;
		int remain = a%b;
		String toMixedNum = whole + "_" + remain + "/" + b; 
		return toMixedNum;
	}
/* This method takes four integers and returns a String.
 */
	public static String foil(int a, int b, int c, int d, String n) {
		int first = a*c;
		int second = a*d+b*c;
		int third = c*d;
		String foil= first + "n^2 + " + second + "n +" + third;
		return foil;
	}
/* This method takes two integers and returns a boolean.
 */
	public static String DivisibleBy(int a, int b) {
		if (a%b == 0) {
			return "yes";
		}
		else {
			return "no";					
		}
	}
/* This method takes a double and returns a double.
 */
	public static double absValue(double operand) {
		if(operand <=0) {
			return (operand*1);
		}else {
			return operand;
		}
	}
/* This method takes two doubles and returns a double.
 */
	public static double max(double a, double b) {
		if (a > b){
			return a;
		}else {
			return b;
		}
	}
/* This method takes three doubles and returns a double.
 */
	public static double max(double a, double b, double c) {
		if (a > b && a > c){
			return a;
		}if (b > a && b > c){
			return b;
		}else {
			return c;
		}
	}
/* This method takes two integers and returns an integer.
 */
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		}else {
			return b;
		}
	}
/* This method takes a double and returns a double.
 */
	public static double round2(double a) {
		double b = a*1000;
		double c = b%10;
		
		if (c < 0.5) {
			return (a - (c / 100);
		}else {
			int d = a*100;
			return (d/100.0+0.01);
		}
/* This method takes a double and an integer and returns a double.
 */
//	public static double exponent(double a, int b) {
		
	}	
}
