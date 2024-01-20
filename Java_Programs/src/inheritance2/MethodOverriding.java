package inheritance2;

public class MethodOverriding {
	public static void main(String[]args)
	{
		Bus bs=new Bus();
		bs.fuel();
	}
	

}
//methodoveriding -can method name and return type but can change in body 

class Vehicle
{
	void fuel()
	{
		System.out.println("petrol");
		}
}
class Bus extends Vehicle
{
	
//	String fuel()
//	{
//		System.out.println("diesel");
//		}
	
	void fuel()
	{
		System.out.println("disesl");
		//can change body
		}
	
}
class Car extends Vehicle
{
	
}
class Bike extends Vehicle
{
	
	
}

