package Java_Programs;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=20;
		int i=65;
		b=(byte)i;
		System.out.println(b);
		char ch='a';
		int l=ch;
		//implicit conversion small to big
		
		System.out.println(l);
		
		//explicit conversion big to small
		int y=90;
		char z=(char)y;
		System.out.println(z);
		

	}

}
