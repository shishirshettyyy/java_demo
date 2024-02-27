class first
{
	int a;
	first(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println("value of first "+a);
	}
}	

class next extends first
{
	int b;
	next(int x,int b)
	{
		super(x);
		this.b=b;
	}
void display()
{
	System.out.println("values of b is "+b);
}
}

class prgmoverride
{
	public static void main(String args[])
	{
		next objnext=new next(10,20);
		objnext.display(); //calling overriden method
	}
}	