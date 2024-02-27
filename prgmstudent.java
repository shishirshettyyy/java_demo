class student 
{
int rollno;
int sem;
String name;
int total_marks;

student()
	{/*
	rollno=0;
	name="\0";
	sem=0;
	total_marks=0;*/
	}
	student(int r,String n,int s,int t)
	{
		rollno=r;
		name=n;
		sem=s;
		total_marks=t;
	}
	void display()
	{
		System.out.println("rollno"+rollno);
		System.out.println("name"+name);
		System.out.println("sem"+sem);
		System.out.println("total_marks"+total_marks);
	}
}
class prgmstudent
{
	public static void main(String args[])
	{
		student s1=new student();
		student s2=new student(2,"shishir",4,625);
		s1.display();
		System.out.println();
		s2.display();
	}
}		