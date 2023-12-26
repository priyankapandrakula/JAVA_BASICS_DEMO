package Java_Programs;

public class loops {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("........");
		//even numbers
		for(int i=2;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("..........");
		
		for(int k=2;k<=10;k+=2)
		{
			System.out.println(k);
		}
		
		//Sum of odd numbers from 1 to 10
		int s=0;
		for(int i=1;i<=10;i++)
		{
			s=s+i;
		}
		System.out.println(s);
		for(int j=10;j>=0;j--)
		{
			System.out.println(j);
		}
		
		int op=2;
		switch(op)
		{
		case 1: System.out.println("case 1");
				break;
		case 2: System.out.println("case 2");
				break;
		case 3: System.out.println("case 3");
				break;
		default :
				System.out.println("nothing");
				
				
		
		
		}

	}

}
