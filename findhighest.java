import java.util.Scanner;
class findhighest
{
	public static void main(String args[])
	{
		int marks[]=new int[10];
		Scanner s1=new Scanner(System.in);
		int number;
		int highest=0;
		System.out.println("enter the marks");
		for (int i=0;i<10;i++)
		{ `
			System.out.println("enter the marks of Student no ="+i+1);
			number=s1.nextInt();
			marks[i]=number;
		}
		for (int i=0;i<10;i++)
		{
			if(marks[i]>highest)
			highest=marks[i];
		}
		System.out.println("highest marks"+highest);
	}
}	