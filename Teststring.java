import java.util.Scanner;

class TestString
{
	public static void main(String args[])
	{
		String S1=new String("Sachin ");
		String S2=new String("Tendulkar");
		String S3=new String("KL");
		String S4=new String("Rahul");
		String Result=new String();
		String Result2=new String();
		
		int n;
		System.out.println("length of string is:"+S1.length());
		System.out.println("uppercase of S2 string is:"+S2.toUpperCase());
		System.out.println("lowercase of S3 string is:"+S3.toLowerCase());
		Result=S1.concat(S2);
		System.out.println("concating string is"+Result);
		
		n=S1.compareTo(S2);
		System.out.println(n);
		
		if(n==0)
			System.out.println("First string is Equal");
		else if(n>0)
			System.out.println("First string is Greater");
		else
			System.out.println("Secong string is Greater");
		
	}	
}