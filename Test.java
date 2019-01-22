class Test
{
public static void main(String s[])
{
int a[]={1,2,3,2,4,2,5,2,60,45,2,56,2};
int i;
int count=0;
for(i=12;i<=a.length;i--)
{
for(int j=12;j<=a.length;j--)
{
if(a[j]==(a[i]))
{
count++;
if(count==3)
{
//return a[i];
System.out.println(j);
}
}

}
}
}
}