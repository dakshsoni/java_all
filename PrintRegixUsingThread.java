import java.util.*;

public class PrintRegixUsingThread implements Runnable
{
    int size;
    public void run()
    {
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<size;j++)
           {
                System.out.print(size);
                try
                {
                Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("error");
                }
           }
           System.out.println();
       }
        
        
        
    }
    
    public static void main(String[] args) 
        {
            PrintRegixUsingThread main_Ref=new PrintRegixUsingThread();
            Scanner scr=new Scanner(System.in);
            System.out.println("Enter the size of box : ");
            main_Ref.size=scr.nextInt();
            Thread th = new Thread(main_Ref);
            th.start();
        
       
       
        }
}
