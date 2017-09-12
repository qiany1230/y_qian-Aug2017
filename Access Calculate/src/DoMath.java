/* Ying Qian
 * September 5, 2017
 * This is the runner class for my Calculate Library methods
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(3.0));
		System.out.println(Calculate.toDegrees(4));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(2, 1, 3));
		System.out.println(Calculate.toMixedNum(5, 4));
		System.out.println(Calculate.foil(2,3,4,5));
		System.out.println(Calculate.isDivisibleBy(3, 2));
	}

}
