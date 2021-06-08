package Programs;

interface Age
{
	int x = 21;
	void getAge();
}

public class AnonmousInnerClassExample {

	public static void main(String[] args) {
		
		MyClass obj=new MyClass();
		System.out.print("This is an Anonymous Class");
		obj.getAge();	
		
	}
}

class MyClass implements Age
{
	@Override
	public void getAge()
	{
		System.out.print("Implementing an Abstract method using Anonymous Class object");
		System.out.print("Age is "+x);
		

	}

}
