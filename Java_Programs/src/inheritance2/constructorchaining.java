package inheritance2;

public class constructorchaining {
	public static void main(String[]args)
	{
		Childclass cc=new Childclass();
		
	}

}
class Superclass
{
	int x;
	Superclass()
	{
		System.out.println("superclass no arg");
	}
	Superclass(int x)
	{
		this.x=x;
		System.out.println("superclass with one arg");
	}
}
//one constructor calls other constrctor ....
class Childclass extends Superclass
{
	int y;
	Childclass()
	{
		this(30);
		System.out.println("childclass with no arg");
	}
	Childclass(int y)
	{
		super(y);
		System.out.println("childclass with one arg");
	}
}