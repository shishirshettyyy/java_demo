class encap
{
	private int SSN;
	private String name;
	private int salary;
	
		public int getSSN()
		{
			return(SSN);
		}
		public void setSSN(int SSN)
		{
			this SSN=SSN;
		}
		public String getName()
		{
			return(name);
		}
		public void setName(String name)
		{
			this name=name;
		}
		public int setSalary(int salary)
		{
			this salary=salary;
		}
		public int getSalary
		{
			return(salary);
		}
}
class prgmencapsulation
{
public static void main(String args[])
{
	encap E1=new encap();
	E1.setSSN(10);
	E1.setName("Shishir")
	E1.setSalary(1000000);
	
	System.out.println("SSN"+E1.getSSN());
	System.out.println("name"+E1.getName());
	System.out.println("Salary"+E1.getSalary());
}
}	