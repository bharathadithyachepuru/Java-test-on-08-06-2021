package Programs;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {

		NavigableSet<String> ts = new TreeSet<>();
		 
	      
        ts.add("Bharath");
        ts.add("Adithya");
 
        System.out.println("Tree Set is " + ts);
 
        String verify = "ADithya";
 
      
        System.out.println("Contains " + verify + " "
                           + ts.contains(verify));
 
        
        System.out.println("First Value " + ts.first());
 
        
        System.out.println("Last Value " + ts.last());
 
        String data = "Aditya";
 
        
        System.out.println("Higher " +ts.higher(data));
        System.out.println("Lower " + ts.lower(data));
        Iterator itr=ts.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }

	}

}
