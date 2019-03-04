class Thread1 extends Thread
{
Runnable r;
String name;
	Thread1()
	{
	
	}
		Thread1(String name)
		{
		this.name=name;
		}
	Thread1(Runnable r)
	{
	this.r=r;
	}
		public void start1()
		{
		if(r==null)
			{
			run();
			}
		else
			{
			r.run();
			}
		}
}


		class MyThread implements Runnable
		{
			public void run()
			{
			try
				{
				Thread.sleep(5000);
		   		}
		catch(InterruptedException p)
		{
			p.printStackTrace();
		}
				System.out.println(Thread.currentThread().getName());
				System.out.println("our run method call");
			for(int i=1;i<=5;i++)
			{

			System.out.println(Thread.currentThread().getName()+":"+i);
			}	
	
	
			}
		}

class ThreadTest
{
public static void main(String s[])
{
	
System.out.println(Thread.currentThread().getName()+":"+"started="+Thread.currentThread().getPriority());
MyThread mth=new MyThread();
MyThread nth=new MyThread();
new ThreadTest();
Thread th=new Thread(mth);
Thread th1=new Thread(nth);
th.start();
th.setPriority(4);
th.setName("mth vali thread");
System.out.println("priority of mth thread="+th.getPriority());//+":"+th.getName());
try
{
th.join();
}
catch(InterruptedException e)
{
	System.out.println("mth stop main thread");
}
th1.start();
th1.setPriority(4);
System.out.println("priority of nth thread="+th.getPriority());
th1.setName("nth vali thread");
	try{
Thread.sleep(10000);
}
catch(InterruptedException p)
{
	/*try{
	th.wait(2000);
	}
	catch(InterruptedException t)
	{}*/
	}
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
}
}

}
