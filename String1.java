class String1
{
public static void main (String s[])
{
String str=new String("Daksh");
str=str.concat("Soni");
String str1="nathusar";

str=str.concat("sikar");
String str2=str.concat("jaipur");
System.out.println("new string="+str2);//dakshsonisikarjaipur
System.out.println("String is="+str);//dakshsonisikar
System.out.println("string constant pool="+str1);//nathusar
}

}