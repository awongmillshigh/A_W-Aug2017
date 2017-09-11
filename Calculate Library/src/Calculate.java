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
		double toRadians = operand*3.14159/180;
		retun toRadians;
	}
	
	// calculates using discriminant
	public static double discriminant(double oeprand1, double operand2, doubl operand3){
		double discriminant = operand2*operand2-4operand1*operand3;
		return discriminant;
	}
	
	//convertes mixed number into an improper fraction
	public static double toImproperFrac(int operand1, int operand2, int operand3){
		int toImproperFrac = operand1*operand3+operand2;
		return toImproperFrac;
	}
	
	//converts an imporproper fraction into a mixed number
	public static double toMixedNum(int operand1, int operand2){
		int toMixedNum = operand1/operand2;
		double toWholeNum = 
		return toMixedNuml	
	}
	
	//converts a binomial mulitiplication form to a quadratic equaion form
	public static double foil(int operand1, int operand2, int operand3, int operand4){
		int foil = operand1*operand3+operand1*operand4+operand2*operand3+operand2*operand4;
		return foil;
		
	
}
