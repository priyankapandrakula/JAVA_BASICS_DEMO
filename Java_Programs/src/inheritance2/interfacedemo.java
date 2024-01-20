package inheritance2;

public class interfacedemo {
	public static void main(String[]args)
	{
		Honda hd=new Honda();
		hd.start();
		hd.go();
		
	}

}
interface Carr
{
	//in interface all methods are fully implemented no need of giving 
	//abstract like abstract methods
	//All are fully intilalized and PUBLIC
	//we can implement multipe interfaces in java
	void start();
	void go();
	
}
class Honda implements Carr
{
	public void start()
	{
		System.out.println("started");
	}
	public void go()
	{
		System.out.println("went ....");
	}
}