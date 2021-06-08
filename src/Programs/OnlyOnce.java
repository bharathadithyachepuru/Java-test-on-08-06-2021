package Programs;

public class OnlyOnce {
	
	 public OnlyOnce(String name) {
		 
	      System.out.println("Passed Name is :" + name + "OnlyOnce class is instantiated Only once");
	   }

	public static void main(String[] args) {

		OnlyOnce myObj = new OnlyOnce( "Adithya" );

	}

}
