package instance_of_example;

public class Father 
{
	String name="Raju";
	
	public void display()
	{
		System.out.println("Name : "+name);
	}

}
//-------------------------------------------------------
package instance_of_example;

public class Son extends Father
{
	String name="Ramu";
	
	public void display()
	{
		System.out.println("Name : "+super.name);
		System.out.println("Name : "+name);
		
		super.display();
	}
	
}
//-------------------------------------------------------
package instance_of_example;

public class FatherSonDriver
{
	public static void main(String[] args) 
	{
		Son s1 =new Son();
		s1.display();
	}
}
//------------------------------------------------------
//output
//Name : Raju
//Name : Ramu
//Name : Raju

