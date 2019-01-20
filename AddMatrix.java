import java.io.*;
class Test
{
	int arr[][];
	int row,column;
	Test(int row,int column)
	{
		this.row=row;
		this.column=column;
		arr=new int[row][column];
	}
	int[][] matrix()
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("matrix is:");
	try{
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
			
			arr[i][j]=Integer.parseInt(br.readLine());
	}
	
	}
	catch(Exception e)
	{};
	return arr;
	}
	int[][] addition(int m1[][],int m2[][])
	{
		int temp[][]=new int[row][column];
		for(int i=0;i<row;i++)
		for(int j=0;j<column;j++)
			temp[i][j]=m1[i][j]+m2[i][j];
	return temp;
	}
	void display(int result[][])
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
class AddMatrix
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("how many row row required:");
		int row=Integer.parseInt(br.readLine());
		System.out.print("how many row column required:");
		int column=Integer.parseInt(br.readLine());
		Test t=new Test(row,column);
		Test t1=new Test(row,column);
		int m1[][],m2[][],m3[][];
		m1=t.matrix();
		m2=t1.matrix();
		m3=t.addition(m1,m2);
		t.display(m3);
	}
}