import java.util.*;
public class Split {

	public static void main(String[] args) {
		String sandwich = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
		String[] filling = sandwich.split("bread");
		for (String breakSandwich : filling) {
		    System.out.println(breakSandwich);
		}
	}
		
	String sandwich2 = "apples pineapples bread lettus tomato bacon mayo ham bread cheese";
	System.out.println(middleSandwich(sandwich2));
		
	public static String middleSandwich(String sandwich2) {
		String[] toppings = new String[sandwich2.split(" ").length];
		int numBread = 0;
		for(int i = 0; i < toppings.length; i++) {
			toppings[i] = sandwich2.split(" ")[i];
			if(toppings[i].equals("bread")) {
				numBread++;
			}
		}
			
		int[] breadSlice = new int[numBread];
		int counter = 0;
		for (int i = 0; i < toppings.length; i++) {
			if (toppings[i].equals("bread")) {
				breadSlice[counter] = i;
				counter++;
			}
		}	
		String middle = "";
		for (int i = breadSlice[0] + 1; i < breadSlice[breadSlice.length - 1]; i++) {
			middle += toppings[i] + " ";
		}	
		return middle;
		}
	
}
