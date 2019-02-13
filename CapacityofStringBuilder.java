class CapacityofStringBuilder
{
public static void main(String s[])
{
StringBuilder str=new StringBuilder();
System.out.println("initial capacity of a string="+str);
str.append("hello");
System.out.println("hello="+str);
System.out.println("new capacity 16="+str.capacity());
str.append("dakshsoni");
System.out.println("hellodakshsoni="+str);
System.out.println("new capacity 16="+str.capacity());
str.append("howareyou");
System.out.println("hellodakshsonihowareyou="+str);
System.out.println("new capacity 34="+str.capacity());
}

}