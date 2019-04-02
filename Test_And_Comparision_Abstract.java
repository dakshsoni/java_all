
/**
 * Write a description of interface Test_And_Comparision_Abstract here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Test_And_Comparision_Abstract
{
   /* Test_And_Comparision_Abstract()
    {
        constructor is not possible of interface;
    }*/
    /*static
    {
    we can not create static block inside interface;
    }*/
    void sampleMethod();//methods are by defalut public and abstract
    public static void m1()
    {
    System.out.println("non static method m1 exctute");
    
    }
    default void m2()
    {
    System.out.println("default method of interface is now execute");
    }
    
}
