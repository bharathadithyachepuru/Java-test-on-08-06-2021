package Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class PreviousAndNextIndexExample {

	public static void main(String[] args) {
		
    ArrayList<Integer> arrList = new ArrayList<Integer>();
     
     arrList.add(5);
     arrList.add(10);
     arrList.add(15);
     arrList.add(20);
     arrList.add(25);
     arrList.add(30);

    System.out.println("Initial arraylist :"+ arrList);

    ListIterator<Integer> iterator = arrList.listIterator();

    System.out.println("previous index :"+ iterator.previousIndex());

     iterator.next();
     iterator.next();

  System.out.println("Next index :" + iterator.nextIndex());

	}

}
