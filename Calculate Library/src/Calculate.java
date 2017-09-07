/*Anthony Wong
 * September 6, 2017
 * Our self written library
 * It contains a series of methods to do basic math functions
 */
public class Calculate {
	//square the input
	public static double square(int operand) {
		int square = operand*operand;
		return square;
	}
	
	//cube the input
	public static double cube(int operand) {
		int cube = operand*operand*operand;
		return cube;
	}
	
	//average the input
	public static double average(double operand1, double operand2){
		double average = operand1*operand2 /2;
		return average;
	}
	
	//average the input(overload)
	public static double average(double operand1, double operand2, double operand3) {
		double average = operand1*operand2*operand3 /3; 
		return average;
		
	}
	
	//convert input to degrees
	public static double toDegrees(double operand) {
		double toDegrees = operand*3.14159;
		return toDegrees;
	}
	
	// convert to radians
	public static double toRadians(double operand) {
		double toRadians = (operand*)
	}
	
}