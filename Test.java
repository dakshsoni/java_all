class Test
{
public static void main(String s[])
{
String str="dakshsoni.ds4743@gmail.com";
System.out.println(str.substring(0));
for(int i=0;i<str.length();i++)
{
System.out.println(str.substring(i));
}
for(int i=0;i<str.length();i++)
{
	try
	{
System.out.println(str.substring(i+2,i+23));

	}
	catch(Exception e)
	{

	System.out.println(str.indexOf('a') );
	

	System.out.println(str.lastIndexOf('a') );
	
}
}
}
}