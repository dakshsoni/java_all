

public class Implemented_class implements Test_And_Comparision_Abstract
{
   
    
public void sampleMethod()
{
System.out.println("public abstract simple method override");
}
    
    
    public static void main(String s[])
    {
    Test_And_Comparision_Abstract.m1();
    Test_And_Comparision_Abstract ref=new Implemented_class();
    ref.sampleMethod();
    ref.m2();
    }
}
