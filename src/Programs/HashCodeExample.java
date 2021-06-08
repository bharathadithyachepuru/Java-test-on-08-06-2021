package Programs;

 class Password {
	  
	  private String password;
	  private String retypedpassword;

	 
	  Password(String x){
	    this.password = x;
	  }
	  public String getpassword()
	  {
	    return this.password;
	  }
	  
	  @Override
	  public int hashCode(){
	    return (int) password.hashCode();
	  }
	  
	  @Override
	  public boolean equals(Object x){
	    if (x == null)
	      return false;
	    Password y = (Password) x;
	    return y.getpassword() == this.getpassword() ;
	  }

	}

public class HashCodeExample {

	public static void main(String[] args) {
		
		 Password p1 = new Password("ABC");
		    Password p2 = new Password("ABC");
		    
		    System.out.println("Hash for password 1: ");
		    System.out.println(p1.hashCode());
		    System.out.println("Hash for password 2: ");
		    System.out.println(p2.hashCode());

		    System.out.println("Equal? ");
		    System.out.println(p1.equals(p2));
		    
	}

}
