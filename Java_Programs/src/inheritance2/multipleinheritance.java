package inheritance2;

public class multipleinheritance {
	public static void main(String[]args)
	{
		Desktop dp=new Desktop();
		dp.start();
	}

}
class Electronic 
{
	void poweron()
	{
		System.out.println("elcetonice");
	}
}

class Tv extends Electronic
{
	void poweron()
	{
		System.out.println("tv");
	}
	
}
class Monitor extends Electronic
{
	void poweron()
	{
		System.out.println("monitor");
	}
	
}
// not possible by extending class Desktop extends Tv,Monitor

class Desktop implements I1 , I2
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		I1.super.start();
		I2.super.start();
	}
	
	
	
}

