import java.lang.Math;
import java.util.Scanner;
class prgmfact
{
public static void main(String args[])
	{
		double result;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the no");
		double number=S.nextInt();
		result=Math.sqrt(number);
		System.out.println("square root of no is"+result);
	}	
}	