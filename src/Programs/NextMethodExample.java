package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class NextMethodExample {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		
	    cars.add("Benz");
	    cars.add("BMW");
	    cars.add("Audi");
	    cars.add("Rolls Royce");

	    Iterator<String> it = cars.iterator();

	     System.out.println(it.next());
	     System.out.println(it.next());
	     System.out.println(it.next());
	     System.out.println(it.next());
	}

}
