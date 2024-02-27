interface constant
{
	final double pi=3.14;
}
interface method extends constant
{
	public void calc_area();
}

class circle implements method
{
int radius;
double area;

circle(int r)
{
radius=r;
}


public void calc_area()
{
	area=pi*radius*radius;
	System.out.println("area is "+area);
	
}
}

class findarea2
{
	public static void main(String args[])
	{
		circle c1=new circle(10);
		c1.calc_area();
	}
}	