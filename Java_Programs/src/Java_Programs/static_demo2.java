package Java_Programs;

public class static_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		static_demo2 dm=new static_demo2();
		dm.method3();

	}
	static 
	{
		System.out.println("static method 1");
	}
	static 
	{
		System.out.println("static method 2");
	}
	void method3()
	{
		System .out.println("non static ");
	}

}
