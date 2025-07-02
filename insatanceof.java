//SonFatherDriver class is example of instanceof. instanceof is keyword as well as operator.
package instance_of_example;

public class FatherSonDriver
{
	public static void main(String[] args) 
	{
		Son s1 =new Son();
		//s1.display();
		
		System.out.println(s1 instanceof Son);
		System.out.println(s1 instanceof Father);
		
		Father f1=new Father();
		
		System.out.println(f1 instanceof Father);
		System.out.println(f1 instanceof Son);
		
		
	}
}
//------------------------------------------------------------
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
//-------------------------------------------------------------
package instance_of_example;

public class Father 
{
	String name="Raju";
	
	public void display()
	{
		System.out.println("Name : "+name);
	}

}
//------------------------------------------------------
//output
//Reference of son belongs to son and father
//Son : true
//Father : true
//Reference of Father belongs to father only
//Father : true
//Son : false


