package inheritance2;

public class superconstructor {
	Buss bb=new Buss(10, 20, 30, 40);
	
	

}
class Vehiclee
{
	//cntrl + slash to uncomment
	//cntrl + slash to comment 

	//cntrl +shift +slash to comment multiple lines at time
	//to uncomment multiple lines cntrl+shift+backshalsh
	  int a,b;
	  Vehiclee(int a,int b) 
	  {
		  this.a=a; this.b=b; 
		 }
	  String fuel()
	  {
		  return "petrol";
	  }
	 

}
class Buss extends Vehiclee
{
	int c,d;
	Buss(int a,int b,int c,int d)
	{
		super(a,b);
		this.c=c;
		this.d=d;
	}
	String fuel()
	{
		return "deisel";
	}
	
	
	
	
}