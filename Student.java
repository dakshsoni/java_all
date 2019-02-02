import java.io.*;
class Student
{
public static void main(String s[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the total subject");
int sub=Integer.parseInt(br.readLine());
System.out.println("enter the marks of each subject");
int marks[]=new int[sub];
for(int i=0;i<sub;i++)
{
System.out.print("subject\t"+ i);
marks[i]=Integer.parseInt(br.readLine());
}
int total=0;
for(int i=0;i<sub;i++)
{
total+=marks[i];
}
System.out.println("total="+total);
float percent=(float)total/sub;
System.out.println("percent is="+percent);
}
}