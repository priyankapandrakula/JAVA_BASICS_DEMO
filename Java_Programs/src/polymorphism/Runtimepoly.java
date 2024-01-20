package polymorphism;

public class Runtimepoly {

	public static void main(String[] args) {
		//Macbook bk=new MacAir();
		Macbook bk=new Macpro();
		
		bk.start();
		bk.shutdown();
		

	}

}

class Macbook
{
	void start()
	{
		System.out.println("mackbook started");
	}
	void shutdown()
	{
		System.out.println("macbook shtdown");
	}
}
class MacAir extends Macbook
//method overding-child class overides parent class methods
{
	void start()
	{
		System.out.println("macair started");
	}
	void shutdown()
	{
		System.out.println("macair shtdown");
	}
}

class Macpro extends Macbook
{
	void start()
	{
		System.out.println("macpro started");
	}
	void shutdown()
	{
		System.out.println("macpro shtdown");
	}
}