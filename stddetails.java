class student
{
 int rollno;
 String name;
public void setdata(int r,String n)
	{
	rollno=r;
	name=n;
	}
public void display()
	{
	System.out.println("roll no is ="+rollno);
	System.out.println("name is ="+name);
	}
}
class stddetails
{
	public static void main(String args[])
	{
	student s1=new student();
	s1.setdata(53,"shishir");
	s1.display();
	}
}
	

