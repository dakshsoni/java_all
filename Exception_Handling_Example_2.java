import java.io.*;
class Base
{
public void overrideMethod() throws Exception
{
throw new Exception();
}
}
public class Exception_Handling_Example_2 extends Base
{
public void overrideMethod()throws FileNotFoundException
{
throw new FileNotFoundException();
}
    
    public static void main(String s[])
{
Base b=new Exception_Handling_Example_2();
try
{
b.overrideMethod();
}  
catch(Exception e)
{
System.out.println("catch exception handle");
}
}
}