class String1
{
public static void main(String s[])
{
String s1="hii this is deepak how i can help you";
System.out.println(s1.length());
//String d[]=s1.split("");
String d1[]=s1.split(" ",3);
String d2[]=s1.split(" ",4);
for(String d:s1.split(""))
{
System.out.println(d);
System.out.println(d.length());
}
for(int i=0;i<d1.length;i++)
{
System.out.println(d1[i]);
}
for(int i=0;i<d2.length;i++)
{
System.out.println(d2[i]);
}


}
}