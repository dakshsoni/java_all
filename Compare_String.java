

public class Compare_String
{
    
   public static void main(String s[])
   {
    String s1=new String("Hospital");
    String s2=new String("H");
    System.out.println(s1.compareTo(s2));
    /*length ke according bcz whenever we getting matching of charcters it will continue 
    matching new char like here H matche With H.
    then next char is o in s1 but there is no more char in s2 then it compare with length */
    String s3="hospital";
System.out.println(s1.compareTo(s3));   
//unicode k according mean H-h__(72-104=-32)=-ive value bcz h having higher value than H
int x='h';
System.out.println(x); 
}
   
}
