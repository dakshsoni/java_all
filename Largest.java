class Largest
{
public static void main(String s[])
{
int a[]={01,72,93,49,51};
int temp=0;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
	}
	System.out.println(a[a.length-1]);
}
}