//now i'm taking string constructor and compare these 
class Test
{ 

void m1()
{
char []ch={'y','a','v','a'};
byte []b={106,98,118,97};
String s0=new String(ch);
System.out.println(ch);
String s1=new String(b);
System.out.println(b);
for(int i=0;i<ch.length;i++)
{

System.out.println(ch[i]==b[i]);


System.out.println(s0.equals(s1));


System.out.println(s0.compareTo(s1));
}

}



public static void main(String s[])
{
Test t=new Test();
t.m1();
}

}