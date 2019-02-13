class StringCheckAllMethods
{
public static void main(String s[])
{
String str="hello daksh soni";
System.out.println(str);
//1.public char charAt(int index)
System.out.println("char at index 6 is d="+str.charAt(6));
//2.public String concat("add in string")
str=str.concat("   how are you");
System.out.println(str);
//3.1.public int indexOf(char ch)
System.out.println("index of s is 9="+str.indexOf('s'));
//3.2public int lastIndexOf(char ch)
System.out.println("last index of s is 12="+str.lastIndexOf('s'));
//4.public boolean isEmpty()
System.out.println("given string is not empty so output false="+str.isEmpty());
//5.public string substring(int beging) or(int beging,int ending)
System.out.println("using substring method the string start from daksh.....you="+str.substring(6));
System.out.println("using substring method include beging index excluse last index so output start from daksh....="+str.substring(6,18));
//6.public String replace(old char,new char) or (old string,new string)
System.out.println("replace string daksh to bhagu="+str.replace("daksh","bhagu"));
System.out.println("replace string a with n="+str.replace('a','n'));
//7.public string trim()remove white space
System.out.println("remove white space="+str.trim()+      "   jaipur");
System.out.println("remove white space="+str+      "jaipur");
//8.1.public boolean startWith()
System.out.println("true="+str.startsWith("h"));
//8.2public boolean endwith
System.out.println("false="+str.endsWith("h"));
//9.public String[] split("",int limit)split the string
String s11[]=str.split(" ");
for(int i=0;i<s11.length;i++)
{
	
	System.out.println(s11[i]);
}
String s12[]=str.split("a");
for(int i=0;i<s12.length;i++)
{
	
	System.out.println(s12[i]);
}
String s1[]=str.split("o",-2);
for(int i=0;i<s1.length;i++)
{
	
	System.out.println(s1[i]);
}
System.out.println("com");
String s2[]=str.split("o",-1);
for(int i=0;i<s2.length;i++)
{
	
	System.out.println(s2[i]);
}
String s3[]=str.split("o",0);
for(int i=0;i<s3.length;i++)
{
	
	System.out.println(s3[i]);
}
String s4[]=str.split("o",1);
for(int i=0;i<s4.length;i++)
{
	
	System.out.println(s4[i]);
}
String s5[]=str.split("o",2);
for(int i=0;i<s5.length;i++)
{
	
	System.out.println(s5[i]);
}

String s6[]=str.split("y");
for(int i=0;i<s6.length;i++)
{
	
	System.out.println(s6[i]);
}
String s7[]=str.split("y",0);
for(int i=0;i<s7.length;i++)
{
	
	System.out.println(s7[i]);
}
//10.public byte[] getBytes()string convert into bytes
byte[]b=str.getBytes();
for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}
//11.public char[] toCharAt()string convert into chars.
char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
	
	System.out.println(ch[i]);
}
//12.public int compareTo()compare the string.comapreTo method is comparable interface and override in string class
System.out.println("now i compare the string="+str.compareTo(str));
System.out.println("now i compare the string="+str.compareTo("i am daksh a"));
//13.1.public boolean matches() or contains()it check the contains from predefine string if it available then it print true otherwise print false
System.out.println("contains() print true="+str.contains("how"));
System.out.println("matches() print true="+str.matches("hello"));    

//15.public int length() 
System.out.println("length()="+str.length());
//16.public static valueOf ()it convert all data type into a string like
/*System.out.println("valueOf(int 15)="+str.valueOf(int 15));
System.out.println("valueOf(char 'a')="+str.valueOf(char 'a'));
System.out.println("valueOf(boolean true)="+str.valueOf(boolean true));
System.out.println("valueOf(float 10.0F)="+str.valueOf(float 10.0F));
System.out.println("valueOf(byte 15)="+str.valueOf(byte 15));
System.out.println("valueOf(short 15)="+str.valueOf(short 15));
System.out.println("valueOf(long 9898989898998)="+str.valueOf(long 9898989898998));
System.out.println("valueOf(double 15181819889819.0000)="+str.valueOf(double 15181819889819.0000));
*/
//17.1 public toLowerCase(),toUpperCase()
System.out.println("toUpperCase()="+str.toUpperCase());
System.out.println("toLowerCase()="+str.toLowerCase());


}
} 