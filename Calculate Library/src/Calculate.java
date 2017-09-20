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
	
	//determines if an integer is divisible by another
	public static double isDivisibleBy(int operand1. int operand2){
		if(operand1%operand2==0){
			System.out.println(operand1 + " is divisible by " + operand2);
		}else{
			System.out.println(operand1 + "is not divisible by " + oeprand2);
		}
		return isDivisibleBy;
	}
	
	//returns an absolute value
	public static double absValue(int operand){
		int absValue();
		returnabsValue;
	}
	
	//returns a larger value passed
	public static double max(int operand1, int operand2){
		if(operand1>operand2){
			System.out.println("The larger value is " + operand1);
		}else{
			System.out.println("The larger value is " + operand2);
		}
		return max;
	}
	
	//returns a smaller value
	public static double min(int operand1, int operand2){
		if(operand1<operand2){
			System.out.println("The smaller value is " +  operand1);
		}else{
			System.out.println("The smaller value is " + operand2);
		}
		return min;
	}
	
	//rounds a double to 2 decimal places
	public static double round2(double orig){
	double result = 0.0;
			
	int tempInt = (int)(orig*1000);
	int roundNum = tempInt%10;
	if(roundNum >= -5 && tempInt > 0) 
		tempInt++;
	else if(roundNum <= -5 && tempInt < 0)
		tempInt--;
	result = tempInt/ 100.0;
	return result;
	}
	
	//raises a value to a positive integer
	public static double exponent(double base, int power){
		double exponent = base*;
		return exponent;
	}
	
	//returns a factorial of the value passed
	public static double factorial(int operand){
		
	}
	
	
	//determines whether an integer is prime
	public static double isPrime(int operand){
		if(int operand >1){
		System.out.println("The number " + operand + " is a prime number.");
		}else{
			System.out.println("The number " operand + " is not a prime number");
		return isPrime;
	}
	
	//finds the greatest common factor of 2 integers
	public static gcf(int operand1, int operand2){
	}
	
	//returns an approximation of the square root of the value passed, rounded to 2 decimal places
	public static sqrt(double operand){
	}
				
	
}
