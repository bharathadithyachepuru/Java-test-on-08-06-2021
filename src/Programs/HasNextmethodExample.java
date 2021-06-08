package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class HasNextmethodExample {

	public static void main(String[] args) {

		 ArrayList<String> list = new ArrayList<String>();
		  
	        list.add("Bharath");
	        list.add("Bharath Adithya");
	        
	        Iterator<String> iterator = list.iterator();
	        
	       
	        System.out.println(iterator.hasNext());
	  
	       
	        iterator.next();
	  
	       
	        System.out.println(iterator.hasNext());
	  
	        
	        iterator.next();
	  
	        
	        System.out.println(iterator.hasNext());

	}

}
