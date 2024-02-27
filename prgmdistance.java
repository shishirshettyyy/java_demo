class distance
{
 int Meters;
 int cms;
public void setdata(int m,int cm)
	{
	Meters=m;
	cms=cm;
	}
public void display()
	{
	System.out.println("our distance="+Meters);
	System.out.println("our centimeters="+cms);
	}
}
class prgmdistance
{
	public static void main(String args[])
	{
	distance d1=new distance();
	d1.setdata(10,90);
	d1.display();
	}
}
	

