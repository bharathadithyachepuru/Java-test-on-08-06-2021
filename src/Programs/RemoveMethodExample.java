package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveMethodExample {

	public static void main(String[] args) {

		String removeElem = "Telugu";
		
        List<String> myList = new ArrayList<String>();
        
        myList.add("Telugu");
        myList.add("English");
        myList.add("Biology");
        myList.add("Social");
        
        
        System.out.println("Before remove:");
        
        System.out.println(myList);
        
        Iterator<String> itr = myList.iterator();
        
        while(itr.hasNext()) {
        	
            if(removeElem.equals(itr.next())) {
            	
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);

	}

}
