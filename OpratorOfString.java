class OpratorOfString
{
public static void main(String s[])
{
String s0="ducat";
String s1="ducat";
System.out.println("memory address of s0 and s1 are same or not:-" + s0==s1);//false
System.out.println("memory address of s0 and s1 are same or not:-" + (s0==s1));//true
System.out.println(s0==s1);//true
}

}