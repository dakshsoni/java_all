class Concate
{
public static void main(String s[])
{
String s1=new String("daksh");
s1.concat("soni");
s1=s1.concat("soni");
s1+=s1.concat("soni");
String s2="daksh";
System.out.println(s1==s2);//false
System.out.println(s1.equals(s2));//true

}
}