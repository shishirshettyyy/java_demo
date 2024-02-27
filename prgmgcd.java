import java.util.Scanner;
class prgmgcd
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the m value");
		int m=S.nextInt();
		System.out.println("enter the n value");
		int n=S.nextInt();
		while(m!=n)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
    System.out.println("GCD of given number is:"+m);
	}
}	