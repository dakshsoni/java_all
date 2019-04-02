import java.util.Date;
public class Date_Test extends Date
{
   
    public Date_Test()
    {
     
    }
public String toString()
{
return ("old date");
}
 public static void main(String s[])
 {
    Date d=new Date_Test();
    System.out.println("current date="+d);
    }
}
