import java.util.Scanner;
class CheckBiggerinArray
{
	
public static void main(String s[])
{
	int bigger;
Scanner scr=new Scanner(System.in);
System.out.println("enter the size of array you want");
int i=scr.nextInt();
int arr[]=new int[i];
System.out.println("enter the values in array");

for(int j=0;j<arr.length;j++)
{
	int str=scr.nextInt();
	arr[j]=str;
}

for(int k=0;k<arr.length;k++)
{
for(int p=0;p<arr.length;p++)
{	
	if(arr[k]>arr[p])
	{
		bigger=arr[p];
		arr[p]=arr[k];
		arr[k]=bigger;
	}
	
}
}
System.out.println("the bigger value in array is:"+arr[0]);

}
}
