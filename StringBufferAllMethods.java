class StringBufferAllMethods
{
public static void main(String s[])
{
StringBuffer s1=new StringBuffer("");
System.out.println(s1);
//s1.ensureCapacity(2000));
System.out.println("1.public  int capacity()");
System.out.println("1.1.public  int length()");
System.out.println("initial capacity of the given string is 16="+s1.capacity());
System.out.println("2.public synchronized StringBuffer append()");
s1.append("hello"+"daksh"+"soni");
System.out.println("hellodakshsoni="+s1);
System.out.println("after append capacity of the given string is 16="+s1.capacity());
System.out.println("after addend length of the given string is 14 ="+s1.length());
//System.out.println("after append ensureCapacity of the given string is ="+s1.ensureCapacity());without arguments ensureCapacity()not work
System.out.println("3.public synchronized StringBuffer insert()");
System.out.println("insert a string at index 2="+s1.insert(2,"i am good"));
System.out.println("after insert capacity of the given string is 34="+s1.capacity());
System.out.println("after insert length of the given string is 23 ="+s1.length());
//System.out.println("after insert ensureCapacity of the given string is ="+s1.ensureCapacity());without arguments ensureCapacity()not work
System.out.println("4.1.public synchronized StringBuffer delete(int beging,int ending)");
System.out.println("delete string 4 to 7="+s1.delete(4,7));
System.out.println("after delete string capacity of the given string is 34="+s1.capacity());
System.out.println("after delete at index 4,7 length of the given string is ="+s1.length());
System.out.println("4.2.public synchronized StringBuffer delete(int beging)");
//System.out.println("delete at index 5="+s1.delete(5));delete method not allow for single arguments
System.out.println("delete string index 5 34="+s1.capacity());
System.out.println("after delete index 5 length of the given string is 20="+s1.length());
System.out.println("5.1public synchronized StringBuffer reverse()");
System.out.println("reverse the s1 string="+s1.reverse());
System.out.println("after reverse the string capacity is 34="+s1.capacity());
System.out.println("after reverse length of the given string is 20 ="+s1.length());
//System.out.println("5.2.public synchronized StringBuffer reverse(3,7)");
//System.out.println("reverse string at index 3,7="+s1.reverse(3,7));not allow any arguments in reverse method
System.out.println("after reverse at index 3,7 the string capacity is="+s1.capacity());
System.out.println("after reverse length of the given string is ="+s1.length());
System.out.println("6.1.public synchronized StringBuffer replace(int,int,string)");
System.out.println("replace string h to b="+s1.replace(0,3,"b"));//0 se 2 index ki value ko b se replace kar dega

System.out.println("after replace char then string capacitry is 34="+s1.capacity());
System.out.println("after replace char length of the given string is 18="+s1.length());
//System.out.println("after replace char ensureCapacity of the given string is ="+s1.ensureCapacity());without arguments ensureCapacity()not work
System.out.println("6.2.public synchronized StringBuffer replace()"+s1.replace(1,2,"ye"));//public StringBuffer replace(int,int,string);
System.out.println("after replace string capacitry 34="+s1.capacity());
System.out.println("after replace string length of the given string is 19 ="+s1.length());
System.out.println("7.public void ensureCapacity()");
s1.ensureCapacity(2000);
System.out.println(s1.capacity());
System.out.println("public void trimToSize()");
s1.trimToSize();
System.out.println(s1);

}

}