
public class Child extends Test_constructor_static_block
{
   public void m1()
    {
    System.out.println("abstract method m1 override");
    }
   public static void main(String s[])
   {
    Test_constructor_static_block t=new Child();
    t.sampleMethod();
    t.m1();
   t.main();
   }
}