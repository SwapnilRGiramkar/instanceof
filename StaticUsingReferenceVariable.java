//call Static method or variable using object reference
package instance_of_example;

public class A 
{
	
	public static void test()
	{
		System.out.println("This is from test method ");
	}
}
//------------------------------------------------------------
package instance_of_example;

public class B 
{
	public static void main(String[] args) {
		A a = new A();
		a.test();
	}
	
}
//-------------------------------------------------------------
//In this above program we called Static method using object reference.
//this object reference search methd test() in object if he cant found,
//he have an reference of class static area he goes to class sattic area 
//and print the method test() this is not a good paractice to call static method 
//then we call classname with static method.
