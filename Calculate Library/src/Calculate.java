/* Ying Qian
 * September 5,2017
 * This is our home grown library that will contain various mathematical method.
 */

public class Calculate {

private static final boolean yes = false;
private static final boolean no = false;
/* This method takes an integer and returns its square. 
 */
	public static int square(int inputnum) {
		int squared = inputnum * inputnum;
		return squared;
	}
	
/* This method takes an integer and returns its cube.
 */
	public static int cube(int inputnum) {
		int cubed = inputnum * inputnum * inputnum;
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
	public static double average(double num1, double num2, double num3) {
		double average = (num1 + num2 + num3)/3;
		return average;
	}
/* This method takes an angle measure given in radians into degrees. double=>double
 */
	public static double toDegrees(double inputrad) {
		double toDegrees = (inputrad * 180) / 3.14159;
		return toDegrees;
	}
/* This method takes an angle measure given in degrees into radians. double=>double
 */
	public static double toRadians(double inputdeg) {
		double toRadians = 180 / (inputdeg * 3.14159);
		return toRadians;
	}
/* This method takes three doubles and returns a double.
 */
	public static double discriminant(double a, double b, double c) {
		double discriminant = (b * b) - (4 * a * c);
		return discriminant;
	}
/* This method takes three integers and returns a String.
 */
	public static String toImproperFrac(int whole, int num, int denom) {
		int totalnum= (whole * denom) + num;
		String toImproperFrac = totalnum + "/" + denom;
		return toImproperFrac;
	}
/* This method takes two integers and returns a String.
 */
	public static String toMixedNum(int totalnum, int denom) {
		int whole = totalnum / denom;
		int remain = totalnum % denom;
		String toMixedNum = whole + "_" + remain + "/" + denom; 
		return toMixedNum;
	}
/* This method takes four integers and returns a String.
 */
	public static String foil(int firstnum, int secondnum, int thirdnum, int fourthnum, String n) {
		int squarenum = firstnum * thirdnum;
		int variablenum = firstnum * fourthnum + secondnum * thirdnum;
		int num = thirdnum * fourthnum;
		String foil= squarenum + "n^2 + " + variablenum + "n +" + num;
		return foil;
	}
/* This method takes two integers and returns a boolean.
 */
	public static boolean isDivisibleBy(int firstnum, int secondnum) {
		if (firstnum % secondnum == 0) {
			return yes;
		}
		else {
			return no;					
		}
	}
/* This method takes a double and returns a double.
 */
	public static double absValue(double inputnum) {
		if(inputnum <= 0) {
			return (inputnum * 1);
		}else {
			return inputnum;
		}
	}
/* This method takes two doubles and returns a double.
 */
	public static double max(double firstnum, double secondnum) {
		if (firstnum > secondnum){
			return firstnum;
		}else {
			return secondnum;
		}
	}
/* This method takes three doubles and returns a double.
 */
	public static double max(double firstnum, double secondnum, double thirdnum) {
		if (firstnum > secondnum && firstnum > thirdnum){
			return firstnum;
		}if (secondnum > firstnum && secondnum > thirdnum){
			return secondnum;
		}else {
			return thirdnum;
		}
	}
/* This method takes two integers and returns an integer.
 */
	public static int min(int firstnum, int secondnum) {
		if (firstnum < secondnum) {
			return firstnum;
		}else {
			return secondnum;
		}
	}
/* This method takes a double and returns a double.
 */
	public static double round2(double inputnum) {
		double movedecimalpt = inputnum * 1000;
		double remainder = movedecimalpt % 10;
		
		if (remainder < 0.5) {
			return (inputnum - (remainder / 100));
		}else {
			int backtoorignum = (int) (inputnum * 100);
			return (backtoorignum / 100.0 + 0.01);
		}
	}
/* This method takes a double and an integer and returns a double.
 */
	public static double exponent(double inputnum, int power) {
		double prod = 1;
		while (prod < power) {
			prod = inputnum * inputnum;
		}
		return prod;
	}
	
	//
/* This method takes an integer and returns an integer.
 */
	public static int factorial(int num) {
		int countnum = 1;
		int increnum = 1;
		while (countnum < num) {
			countnum = countnum * increnum;
			increnum ++;
		}
		return countnum;
	}
/* This method takes an integer and returns a boolean.
 */
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if(isDivisibleBy(num, i)) {
				return false;
			}
		}
		return true;
	}
/* This method takes two positive integers and returns an integer
 */
	public static int gcf(int num1, int num2){
		int i = num1;
	    int z = num2;
	    while(num2 != 0){
	    		if(isDivisibleBy(i, z)){
	    			num1 = num2;
	        }else{
	        		int x = num1;
	             num1 = num2;
	             num2 = x % num2;
	         }
	    }
	    return z;
	}
/* This method takes a double and returns a double.
 */
	public static double sqrt(double num) {
		double a;
		if (num < 0) {
			throw new IllegalArgumentException ("Do not accept negative number");
		}
		double square = num / 2;
		do {
			a = square;
			square = (a + (num / a)) / 2;
		} 
		while ((a - square) !=0);
		return round2(square);
	}
/* This method takes three integers and returns a string.
 */
	public static String quadForm(double a, double b, double c) {
		if ((b * b) - 4 * a * c < 0) {
			return "no real roots";
		} else if ((b * b) - 4 * a * c == 0) {
			double root = round2(-b / (2 * a));
			String answer = "( " + root + " , " + "0)";
			return answer;
		} else {
			double pos = round2((-b + (sqrt((b * b) - 4 * a * c)))) / (2 * a);
			double neg = round2((-b - (sqrt((b * b) - 4 * a * c)))) / (2 * a);
			String result = "(" + neg + " , " + pos + ")";
			return result;
		}
	}
}
