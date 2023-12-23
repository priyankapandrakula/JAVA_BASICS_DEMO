package Java_Programs;

public class nonstatic_demo3 {
	public nonstatic_demo3()
	{
		System.out.println("from constructor");
	}
	
	{
		System.out.println("from non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main method");
		nonstatic_demo3 dm=new nonstatic_demo3();
		Car cr=new Car();
		System.out.println(cr.nofwheels);
		System.out.println(Car.manufacturer);

	}

}
