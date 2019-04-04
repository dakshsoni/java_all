
public class Demo
{
    public static void main(String s[])
{
    System.out.println(Thread.currentThread().getName()+"is started");
ThreadDemo ref=new ThreadDemo();
ref.start();
try{Thread.sleep(1000);}
catch(InterruptedException e)
{
    System.out.println("main thread Exception handle");}
System.out.println("no Interrupt");
}
    
   
}
class ThreadDemo extends Thread
{
 public void run()
    {
    System.out.println("our run method");
    Thread ref=Thread.currentThread();
    ref.setName("ThreadDemo");
    System.out.println(ref.getName()+"is started");
    System.out.println(ref.getName()+"going to sleep");
    try
    {
    Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
    System.out.println("thread interrupted");
     }
    System.out.println(ref.getName()+"sleep time over");
    }
}
