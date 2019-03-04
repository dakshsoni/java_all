class Thread1
{
public static void main(String s[])
{
System.out.println("main thread start");
Thread th=Thread.currentThread();
System.out.println(th);
System.out.println(th.getPriority());
System.out.println(th.getName());
th.setName("my thread");
System.out.println(th);
th.setPriority(10);
System.out.println(th);
//th.join()throws intruptedException;
System.out.println(th);
System.out.println(th.isAlive());
try
{
th.sleep(5000);
}
catch(InterruptedException e)
{
	e.printStackTrace();
}
try
{
th.join();
}
catch(InterruptedException e)
{
	e.printStackTrace();
}

}
}