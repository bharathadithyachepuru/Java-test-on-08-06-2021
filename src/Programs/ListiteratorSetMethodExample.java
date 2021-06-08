package Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorSetMethodExample {

	public static void main(String[] args) {

		 ArrayList < String > celebrities = new ArrayList < String > ();
		 
	        celebrities.add("Sachin");
	        celebrities.add("Sehwag");
	        celebrities.add("Dhoni");
	        celebrities.add("Virat kohli");
	 
	        ListIterator < String > listIterator = celebrities.listIterator();
	 
	 
	        while (listIterator.hasNext()) {
	        	
	            System.out.println(listIterator.next());
	        }
	 
	        listIterator.set("Rohit sharma");
	 
	        System.out.println("List after set():- ");
	 
	        for (String string: celebrities) {
	        	
	            System.out.println(string);
	        }

	}

}
