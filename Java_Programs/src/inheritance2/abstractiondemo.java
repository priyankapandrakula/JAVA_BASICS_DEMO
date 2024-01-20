package inheritance2;

public class abstractiondemo {
	public static void main(String[]args)
	{
		Bmwthreeseries three=new Bmwthreeseries();
		three.accelerate();
		three.start();
		
		Bmwfiveseries five=new Bmwfiveseries();
		five.accelerate();
		five.start();
		
		//BMW bm=new BMW();-->cannot iniate..
		BMW bm=new Bmwthreeseries();
		bm.accelerate();
		bm.start();
	}

}
abstract class BMW
{
	void start()
	{
		System.out.println("started");
	}
	abstract void accelerate();
	//hides implementation only gives what necessary
}
class Bmwthreeseries extends BMW
{

	@Override
	void accelerate() {
		System.out.println("threeseries");
		
	}
	
}
class Bmwfiveseries extends BMW
{

	@Override
	void accelerate() {
		System.out.println("fiveseries");
		
	}
	
}