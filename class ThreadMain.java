class InterruptedThread extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
try
{
Thread.sleep(6000);
}
catch(InterruptedException e)
{
	System.out.println(Thread.currentThread().getName()+"thread 0 is goes to sleep");
	return;

}
System.out.println("normal interrupted");
}
}
class ThreadMain
{
public static void main(String s[])
{
System.out.println(Thread.currentThread().getName());
InterruptedThread rt=new InterruptedThread();
Thread th=new Thread(rt);
th.setName("rt");
th.start();
try
{
Thread.sleep(5000);
System.out.println(Thread.currentThread().getName()+" main thread goes to sleep for 5 sec");
}
catch(InterruptedException e)
{
	System.out.println(Thread.currentThread().getName()+" main thread goes to sleep for 5 sec");
th.interrupted();
}
}
}