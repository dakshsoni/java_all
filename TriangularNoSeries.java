import java.util.Scanner;
class TriangularNoSeries
{
public static void main(String s[])
{
	Scanner scr=new Scanner(System.in);
	System.out.println("how many digits you want in TriangularNoSeries");
int i=1,j=2;
int digits=scr.nextInt();
int Triangular[]=new int [digits];

for(int k=0;k < digits;k++)
{
	if(k == 0)
	{
		Triangular[k]=i;
	}
	else if(k == 1)
	{
		Triangular[k]=i+j;
	}
	else
	{
		Triangular[k]=Triangular[k-1]+ ++j;
	}
	System.out.print(Triangular[k]+",");
}

}
} 