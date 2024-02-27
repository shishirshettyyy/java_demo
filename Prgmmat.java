class Prgmmat
{
	public static void main(String args[])
	{
		int mat1[][]={{10,20},{30,40},{50,60}};
		int mat2[][]={{100,200},{300,400},{500,600}};
		int mat3[][]=new int[3][2];
	
		for(int i=0;i<3;i++)
			for(int j=0;j<2;j++)
				mat3[i][j]=mat1[i][j]+mat2[i][j];	
	
		for(int i=0;i<3;i++)
		{	
			for(int j=0;j<2;j++)
				System.out.print("\t"+mat3[i][j]);
			System.out.println("\n");
		}
	}
}