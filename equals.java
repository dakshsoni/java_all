//String class m equals method k 2 part hai (1.equals():-use to check content in the refrance variable)
//(2.equalsIgnoreCase:-)
class equals
{
public static void main (String s[])
{
String s1="ducat";
String s2="Ducat";
String s3="DUCAT";
String s9="daksh";
String s4=new String("ducat");
String s5=new String("Ducat");
String s6=new String("DUCAT");
System.out.println("here we compare string content in scp(string contant pool)");
System.out.println("check s1 & s1:-"+s1.equals(s1));//true
System.out.println("s1 equals s1:-"+s1.equals(s2));//false
System.out.println("check s1 & s3:-"+s1.equals(s3));//false
System.out.println("check s2 & s3:-"+s2.equals(s3));//false
System.out.println("check with ignore case s1 & s1:-"+s1.equalsIgnoreCase(s1));//true
System.out.println("check with ignore case s1 & s2:-"+s1.equalsIgnoreCase(s2));//true
System.out.println("check with ignore case s1 & s3:-"+s1.equalsIgnoreCase(s3));//true
System.out.println("check s1 equals with s1 and s1 in ignore case:-"+s1.equals(s1.equalsIgnoreCase(s1)));//false
System.out.println("check s1 equals with s2 and s3 in ignore case:-"+s1.equals(s2.equalsIgnoreCase(s3)));//false
System.out.println("check s2 equals with s3 and s1 in ignore case:-"+s2.equals(s3.equalsIgnoreCase(s1)));//false
System.out.println("check s3 equals with s1 and s2 in ignore case:-"+s3.equals(s1.equalsIgnoreCase(s2)));//false
System.out.println("now we compare with string content with heap and string constant pool");
System.out.println("check s1 & s4:-"+s1.equals(s4));//true
System.out.println("check s1 equals s5:-"+s1.equals(s5));//false
System.out.println("check s1 & s6:-"+s1.equals(s6));//false
System.out.println("check with ignore case s1 & s4:-"+s1.equalsIgnoreCase(s4));//true
System.out.println("check with ignore case s1 & s5:-"+s1.equalsIgnoreCase(s5));//true
System.out.println("check with ignore case s1 & s6:-"+s1.equalsIgnoreCase(s6));//true
System.out.println("check s1 equals with s1 and s4 in ignore case:-"+s1.equals(s1.equalsIgnoreCase(s4)));//false
System.out.println("check s2 equals with s1 and s5 in ignore case:-"+s2.equals(s1.equalsIgnoreCase(s5)));//false
System.out.println("check s3 equals with s1 and s6 in ignore case:-"+s3.equals(s1.equalsIgnoreCase(s6)));//false
System.out.println("check ignore cases1 & s9:-"+s1.equalsIgnoreCase(s9));//false
}

}