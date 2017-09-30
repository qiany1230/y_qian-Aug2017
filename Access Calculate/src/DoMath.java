/* Ying Qian
 * September 5, 2017
 * This is the runner class for my Calculate Library methods
 */
public class DoMath {

	
	//
	public static void main(String[] args) {
	//	System.out.println(Calculate.square(5));
		//System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(3.0));
		System.out.println(Calculate.toDegrees(4));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(2, 1, 3));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(3, 2));
		System.out.println(Calculate.absValue(3));
		System.out.println(Calculate.max(3, 5));
		System.out.println(Calculate.max(4, 6, 8));
		System.out.println(Calculate.min(5, 7));
		System.out.println(Calculate.round2(3.456));
		System.out.println(Calculate.exponent(3.0,3));
		System.out.println(Calculate.factorial(3));
		System.out.println(Calculate.isPrime(6));
	}
}
