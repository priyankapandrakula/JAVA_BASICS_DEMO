package inheritance;

public class inheritancedemo1 {
	public static void main(String[]args)
	{
		jdk8 ddk=new jdk8();
		ddk.f1();
		ddk.f2();
		ddk.f3();
		
	}
	

}
class jdk6
{
	jdk6()
	{
		System.out.println("installing jdk6");
	}
	void f1()
	{
		System.out.println("method f1");
	}
}
class jdk7 extends jdk6
{
	jdk7()
	{
		System.out.println("installing jdk7");
	}
	void f2()
	{
		System.out.println("method f2");
	}
}
class  jdk8 extends jdk7
{
	jdk8()
	{
		System.out.println("installing jdk8");
	}
	void f3()
	{
		System.out.println("method f3");
	}
}

