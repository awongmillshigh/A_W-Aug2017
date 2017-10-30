import java.util.*;
public class Split {

	public static void main(String[] args) {
		String sandwhich = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
		System.out.println(sandwhich.split("bread"));
				
		String sandwhich2 = "apples pineapples bread lettus tomato bacon mayo ham bread cheese";
		System.out.println(sandwhich2.split("bread"));
	}

}
