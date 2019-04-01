
public class Inheritance extends Base
{
      
      int z=0;
      
      public void method_2()
    {
        z=x+y;
      
    }
void show()
{
    System.out.println(x);
    System.out.println(y);

}
public static void main(String s[])
{
Inheritance ref=new Inheritance();
ref.method_2();
ref.method_1();

ref.show();
}
}
    
class Base 
{
    
    // instance variables - replace the example below with your own
    int x,y;

   
    public void method_1()
    {
        // initialise instance variables
        x = 10;
        y=x+y;
    }

}


