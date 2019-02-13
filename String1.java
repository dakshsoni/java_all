class String1
{
public static void main(String s[])
{
String s1="ducat";
String s5="ducat";
String s4=new String("ducat");
System.out.println(s1==s4);
System.out.println(s1==s5);

String s2="DUCAT";
String s3="Ducat";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s2.equals(s3));
System.out.println(s1.equals(s2.equalsIgnoreCase(s3)));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.compareTo(s2));

String str=new String("dakshsoni");
System.out.println(str.charAt(4));
System.out.println(str.substring(2,6));
} 
}
