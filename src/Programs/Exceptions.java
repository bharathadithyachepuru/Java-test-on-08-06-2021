package Programs;

import javax.imageio.IIOException;

public class Exceptions {
	
	public Exceptions(int rating, String username, int startingyear) {
	
	}
	static void DecreaseRate(String username)throws IIOException{  
		 
		
	     if(username=="&")
	      throw new IIOException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	    
	 }
		public static class Except extends Exceptions{
	   public Except(int rating, String username, int startingyear) {
				
		   super(rating, username, startingyear);
				
			}

	public static void main(String[] args) {

		Exceptions s1=new Exceptions(10,"Bharath",1995);
	      try{  
	      DecreaseRate("Adithya&1");  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  

	}

}
