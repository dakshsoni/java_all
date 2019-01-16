import java.util.*;
class dToBwithoutMethod
{
	
	public static void main(String s[])
	{
	Scanner scr =new Scanner(System.in);
	System.out.println("enter any decimal number");
	int i=scr.nextInt();
	System.out.println("you select this number:"+i);
	int rem[]=new int[40];
	int j=0;
	while(i>0)
		{
			
			rem[j++]=i%2;
			 i = i/2;
		}
		System.out.print("your binary number is:");
		for(int p=j-1;p>=0;p--)
		{
			System.out.print(rem[p]);
		}
	}
	
}