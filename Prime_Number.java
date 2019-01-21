import java.util.Scanner;
class Prime_Number
{
public static void main(String s[])
{

Scanner scr = new Scanner(System.in);
System.out.println("how many times you want to get prime number");
int num=scr.nextInt();
for(int i=2;i <= num;i++)
{
int count=0;
for(int j=1;j<=i;j++)
{

if(i%j == 0)
{
count++;
}
}
if(count > 2)
{
continue;
}
else
{
	System.out.print(i+ " ,");
}
}
}
}