package Programs;

import java.util.Scanner;

import org.omg.CORBA.ORBPackage.InvalidName;

public class UserdefinedException {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();

		
		try{
			boolean temp = name.contains("&");
			if (name.length() > 10 && temp == false) {
				System.out.println("Hello " + name);
			}
		    else 
			  { 
			  throw new Exception();  
			  }
		}
		catch (InvalidName e)
		{
			e.printStackTrace();
		}

	}

}
 class InvalidUserName extends Exception
{

}