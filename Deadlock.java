class A
{
public synchronized void d1(B b)
{
	System.out.println("d1 thread");
	try
	{
		Thread.sleep(0000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println("thread 1 call b k last()");
	b.last();
}
public synchronized void last()
{
	System.out.println("inside A this is last");
}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("thread2 satrt d2()");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("thread2 trying to call a()");
		a.last();
	}
public synchronized void last()
{
	System.out.println("inside b this is last()");
	
}
}
class Deadlock extends Thread
{
	A a = new A();
	B b = new B();
	Deadlock()
	{
		this.start();
		a.d1(b);
	}
	public void run()
	{
		b.d2(a);
	}
	public static void main(String s[])
	{
		new Deadlock();
	}
}
