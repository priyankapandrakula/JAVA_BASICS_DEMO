package polymorphism;

public class compiletimepoly {
	public static void main(String[]args)
	{
		compiletime c=new compiletime();
		c.add(2,80);
		c.add(3.4f, 5.6f);
		c.add("hi", " pp");
	}

}
class compiletime
//method overloading
{
	 void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition of numbers"+res );
	}
	 void add(float a,float b)
	{
		float res=a+b;
		System.out.println("Addition of numbers"+res );
	}
	 public void add(String s1,String s2)
	 {
		 String msg=s1+s2;
		 System.out.println(msg);
	 }
}
