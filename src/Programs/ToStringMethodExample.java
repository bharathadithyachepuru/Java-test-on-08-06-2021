package Programs;

class Pet{

	  String name;
	  int age; 

	  Pet(String n, Integer a) {
		  
	    this.name=n;
	    this.age=a;
	  }
	
	  public String toString() {
		  
	    return "The name of the pet is " + this.name + ". The age of the pet is " + this.age;
	  }
	}


public class ToStringMethodExample {

	public static void main(String[] args) {
		
		Pet p = new Pet("Tommy",5);
	      
	        System.out.println(p.toString());
	      
	}

}
