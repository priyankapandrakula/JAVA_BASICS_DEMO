package Java_Programs;

public class operatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//ARITHMETIC operator
		System.out.println(a+67);
		boolean isselected=true;
		int age=90;
		if (age>78)
		{
			isselected=false;
		}
		else
		{
			isselected=true;
		}
		System.out.println(isselected);
		
		
		//TERNARY operator
		int c=66;
		int d=23;
		int min=c>d?c:d ;
		System.out.println(min);
		
		String st="priyanka can achieve";
		String res= (st=="ok") ? "correct" : "wrong";
		System.out.println(res);
		
		//Assignment operator
		int q=78;
		q=q+5;
		System.out.println(q);
		
		
		
		

	}

}
