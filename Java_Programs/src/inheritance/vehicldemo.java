package inheritance;

public class vehicldemo {
	public static void main(String[]args)
	{
		Car cr=new Car();
		System.out.println(cr.fuel());
		Bike bk=new Bike();
		System.out.println(bk.fuel());
		Bus bb=new Bus();
		System.out.println(bb.fuel());
	}

}
class Vehicle
{
	String fuel()
	{
		return "Petrol";
	}
}
class Bus extends Vehicle
{
	String fuel()
	{
		return super.fuel();
	}
}
class Car extends Vehicle
{
	String fuel()
	{
		return "Diesel";
	}
}
class Bike extends Vehicle
{
	
	
}
