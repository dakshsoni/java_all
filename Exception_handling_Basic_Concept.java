import java.io.*;
public class Exception_handling_Basic_Concept 
{
 public static void main(String s[])
 {
    Exception_Genrator ref=new Exception_Genrator();
    try
    {
    ref.method();
    }
    catch(Exception e)
    {
    System.out.println("checked exception handle by developer");
    }
 }
}
class Exception_Genrator
{
void method() throws IOException
    {
    throw new IOException();
    }
}