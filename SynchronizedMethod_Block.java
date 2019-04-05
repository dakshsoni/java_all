class SynchronizationMethod
{
    
   int data[]={1,2,3,4,5,6,7,8,9,10};
  synchronized public void display()//if display method is call then first execute display method after execute other method bcz synchronized key use to lock on a particular object
   {
   System.out.println("this method calling by Thread : "+Thread.currentThread().getName() );
   for(int i=0; i<10; i++)
   {
           try
           {
            Thread.sleep(2000);
           }
            catch(InterruptedException e)
          {
             System.out.println("exception catch sucessfully by developer");
           }
    System.out.println(i+" :display_value: "+data[i]);
    }
   show();
   }  
   synchronized public void show()
   {
       System.out.println("this method calling by Thread : "+Thread.currentThread().getName() );
   for(int i=0; i<10; i++)
   {
       try
        {
          Thread.sleep(2000);
         
        }
        catch(InterruptedException e)
        {
          System.out.println("exception catch sucessfully by developer");
        }
    System.out.println(i+" :show_value: "+data[i]);
    }
    
  }
}

class MyThread extends Thread
{
    
    SynchronizationMethod Synchronization_ref=null;
    public void run()
   
    {
        
       String name=Thread.currentThread().getName();
      if(name == "My_Thread_1")
      {
         Synchronization_ref.display();//synchronized display method call by My_thread_1
        
      }
    
      if(name == "My_thread_2")
      {
        
          Synchronization_ref.show();//synchronized show method call by My_thread_2
      }
    
  } 
    MyThread(String name,SynchronizationMethod Synchronization_ref)
  {
    super(name);//this name going to Thread class parameterized constructor "Thread(String Name)"
    this.Synchronization_ref=Synchronization_ref;//instance variable data shadowing
  }
}


public class SynchronizedMethod_Block
{
    public static void main(String s[])
    {
        SynchronizationMethod Synchronization_ref=new SynchronizationMethod();
        Thread ref=new MyThread("My_Thread_1",Synchronization_ref);//upcasting
        Thread ref_2=new MyThread("My_thread_2",Synchronization_ref);//upcasting
        ref.start();//main Thread call start method of My_Thread_1
        ref_2.start();//main Thread call start method of My_Thread_2
        Synchronization_ref.display();
         Synchronization_ref.show();
    }
}
