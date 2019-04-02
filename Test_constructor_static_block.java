

abstract class Test_constructor_static_block
{
    static int x=0;
    int y;
    Test_constructor_static_block()
    {
    
    }
    static
    {
    x=10;
    }
    {
    y=10;
    }
    public void sampleMethod()
    {
        System.out.println(x+" "+y);
    }
    public  static void main(){System.out.println("static method inside abstract class");}
    public abstract void m1();
    
}
