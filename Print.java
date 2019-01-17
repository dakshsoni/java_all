import java.lang.String;
class Print
{
public static void main(String s[])
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
	if(i==0)
	{
System.out.print("D");
	}
	
	
	if(i==1 || i==2 || i==3)
	{
		for(j=0;j<5;j++)
		{
			if(j==0 || j==2 || j==3)
			{
			System.out.print(" ");	
			}
			if(j==1 || j==4)
			{
			System.out.print("A");
			}
		}
  	}
	/*if(i==2 || i==3 || i==4)
	{
		for(j=0;j<5;j++)
		{
			if(j==0 || j==2 || j==3)
			{
			System.out.print(" ");	
			}
			if(j==1 || j==4)
			{
			System.out.print("K");
			}
		}
  	}
	if(i==3)
	{
		for(j=0;j<5;j++)
		{
			if(j==0 || j==2 || j==3)
			{
			System.out.print(" ");	
			}
			if(j==1 || j==4)
			{
			System.out.print("S");
			}
		}
  	}*/
	
	if(i==4)
		{
System.out.print("H");
	}
}
System.out.println();

 }
}
}