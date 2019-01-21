import java.util.Scanner;
class FeboN_Series
{
public static void main(String s[])
{
Scanner scr=new Scanner(System.in);
System.out.println("How many time you want febo Series");
int series[]=new int[scr.nextInt()];
for(int i=0;i<series.length;i++)
{
if(i==0 || i==1)
{
	//series[i];
System.out.print(series[i]=1);
}
else
{
	;
System.out.print(series[i]=series[i-1]+series[i-2]);
}
}

}
}