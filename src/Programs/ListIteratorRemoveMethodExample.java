package Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorRemoveMethodExample {

	public static void main(String[] args) {

ArrayList<String> names = new ArrayList<String>();
		
		names.add("Bharath");
		names.add("Adithya");
		names.add("Prakash");
		names.add("Sudarshan");
		names.add("Manikanta");
		
		ListIterator<String> listIterator = names.listIterator();
		
		System.out.println("List before removing names:"+names);
		
		for(int i=0; i<3; i++) {
			
			listIterator.next();
		}
		
		listIterator.remove();
		
		System.out.println("List after removal of names:"+names);


	}

}
