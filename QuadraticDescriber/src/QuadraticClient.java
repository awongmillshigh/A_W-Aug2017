import java.util.*;

public class QuadraticClient {
	
	public static void main(String[]args) {

		boolean done = false;
		Scanner userInput = new Scanner(System.in);
		do {
			System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c");
			System.out.print("a: ");
			double a = userInput.nextDouble();
			System.out.println("b: ");
			double b = userInput.nextDouble();
			System.out.println("c: ");
			double c = userInput.nextDouble();
			System.out.println(Quadratic.quadDescriber(a,b,c));
			System.out.println("Do you want to continue? If not, type 'quit' to end");
			String finish = userInput.next();
			if(finish.charAt(0) == ('q')) {
				done = true;
			}
		}while(!done);
	}
}


