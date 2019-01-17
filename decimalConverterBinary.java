import java.util.*;
class decimalConverterBinary
{
public static void main(String s[])
{
Scanner scr=new Scanner(System.in);
Stack<Integer> s1=new Stack<Integer>();
System.out.println("Enter your number");
int a=scr.nextInt();
int rem;
while(a>0)
{
rem=a%2;
s1.push(rem);
a=a/2;

}
System.out.print("your binary number is:");
while(!(s1.isEmpty()))
{
System.out.print(s1.pop());
}
System.out.println("if you want to convert more number:y/n");
String str=scr.next();
if(str.equals("y"))
{
	System.out.println("enter new value");
	int b=scr.nextInt();
	while(b>0)
{
rem=b%2;
s1.push(rem);
b=b/2;

}
System.out.print("your binary number is:");
while(!(s1.isEmpty()))
{
System.out.print(s1.pop());
}
	
}
else
{
	System.out.println("oky thanks!");
}
}
}