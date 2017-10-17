public class Quadratic {
	public static double quadrDescriber(double a, double b, double c) {
		
		
		
		public static String quadForm(int a, int b, int c) {
			double discr = discriminant(a, b, c);
			if (discr < 0) {
				return "no real roots";
			} else if (discr == 0) {
				double result = (-b + sqrt(discr)) / (2 * a);
				return round2(result) + "";
			} else {
				double posResult = (-b + sqrt(discr)) / (2 * a);
				double negResult = (-b - sqrt(discr)) / (2 * a);
				return round2(min(posResult, negResult)) + " and " + round2(max(posResult, negResult));
			}
			
		}
		
		public static double sqrt(double num) {
			double guess = 0.1;
			double guessSqrt = 0;
			if (num < 0) {
				throw new IllegalArgumentException("The square root of " + num + " is imaginary.");
			}
			while (round2(guessSqrt * guessSqrt) != num) {
				guessSqrt = 0.5 * (num / guess + guess);
				guess += 0.1;
			}
			return round2(guessSqrt);
		}
		
		public static double round2(double num) {
			int noDecimalsNum = (int) (num * 1000); 
			int thousandthDigit = noDecimalsNum % 10;
			noDecimalsNum /= 10;
			if (thousandthDigit >= 5 && noDecimalsNum > 0) {
				noDecimalsNum += 1;
			} else if (thousandthDigit <= -5 && noDecimalsNum < 0) {
				noDecimalsNum -= 1;
			}
			return noDecimalsNum / 100.0;
		}
		
		public static double discriminant(double a, double b, double c) {
			return (b * b) - (4 * a * c);
		}
		
		public static double max(double num1, double num2) {
			if (num1 > num2) {
				return num1;
			} else {
				return num2;
			}
		}
		
		public static int max(int num1, int num2) {
			if (num1 < num2) {
				return num1;
			} else {
				return num2;
			}
		}
		
		public static int min(int num1, int num2) {
			if (num1 < num2) {
				return num1;
			} else {
				return num2;
			}
		}
		
		public static double min(double num1, double num2) {
			if (num1 < num2) {
				return num1;
			} else {
				return num2;
			}
		}
	}
}
