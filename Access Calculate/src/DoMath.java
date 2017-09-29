/*Anthony Wong
 * September 6, 2017
 * This is the runner for the calculate library. It is used to test the calculator */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-4));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(4,6));
		System.out.println(Calculate.average(3,4,5));
		System.out.println(Calculate.toDegrees(90));
		System.out.println(Calculate.toRadians(45));
		System.out.println(Calculate.discriminant(2,4,6));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(7,2));
		System.out.println(Calculate.absValue(-8));
		System.out.println(Calculate.max(6,8));
		System.out.println(Calculate.min(7,4));
		System.out.println(Calculate.round2(3.146));
		System.out.println(Calculate.exponent(2,3));
		System.out.println(Calculate.factorial(-2));
		System.out.println(Calculate.isPrime(5));
		System.out.println(Calculate.gcf(4,6));
		System.out.println(Calculate.sqrt(5));
		System.out.println(Calculate.quadForm(2,4,6));
		
	}
}
