
public class JoinMethodWorking extends Thread
{
   JoinMethodWorking(String name)
   {
    super(name);
    
    }
    
    
    public void run()
    {
       try{ Thread.sleep(2000);
    
}
       catch(InterruptedException e)
       {
           System.out.println("handle sleep exception");
        }
    System.out.println(Thread.currentThread().getName()+" is running");
    }
 public static void main(String s[])
 {
     System.out.println(Thread.currentThread().getName()+" is started");
     JoinMethodWorking ref=new JoinMethodWorking("first");
     JoinMethodWorking ref_1=new JoinMethodWorking("second");
      JoinMethodWorking ref_2=new JoinMethodWorking("Third");
       JoinMethodWorking ref_3=new JoinMethodWorking("forth");
    
    ref.start();
        try
    {
        System.out.println(ref.getName()+" is join");
    ref.join();
    }
    catch(InterruptedException e)
    {
    System.out.println("handle Exception of first join");
    }
    
    
    ref_1.start();
    ref_2.start();
     try
    {
        System.out.println(ref_2.getName()+" is join");
    ref_2.join();
    }
    catch(InterruptedException e)
    {
    System.out.println("handle Exception of second join");
    }
    ref_3.start();
    }
}
