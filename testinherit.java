class person
{
	 int adharno;
	 String name;
	
	void setPerson(int adharno,String name)
	{
	this.adharno=adharno;
	this.name=name;
	}
	void displayPerson()
	{
		System.out.println("adharno is"+adharno);
		System.out.println("name is "+name);
	}
}

class student extends person
{
	int rollno;
	int sem;
	
	void setStudent(int rollno,int sem)
	{
		this.rollno=rollno;
		this.sem=sem;
	}
	void displayStudent()
	{
		System.out.println("roll no is"+rollno);
		System.out.println("sem is"+sem);
	}	
}

class testinherit
{
public static void main(String args[])
{
student s1=new student();
s1.setPerson(100,"shsihir");
s1.setStudent(30,6);
s1.displayPerson();
s1.displayStudent();
}
}	
	