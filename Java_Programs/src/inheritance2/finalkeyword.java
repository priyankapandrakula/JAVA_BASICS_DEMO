package inheritance2;

public class finalkeyword {
	public static void main(String[]args)
	{
	final int x=6;
	//x=90;
	System.out.println(x);
	B bb=new B();
	bb.dowork();
	}

}
class A
{
	final void dowork()
	{
		System.out.println("doig work");
	}
}
class B extends A
{
	//cannot inherit final method
//	void dowork()
//	{
//		System.out.println("doig work");
//	}
}
