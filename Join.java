class Join extends Thread
{
	public void run(){System.out.println(Thread.currentThread().getName()+":"+" thread start");
	for(int i=0;i<5;i++)
{
	System.out.println(Thread.currentThread().getName()+":"+i);
}
}
public static void main(String s[])
{
	
System.out.println(Thread.currentThread().getName()+":"+"main thread start");
Join j1=new Join();
Join j2=new Join();
Join j3=new Join();
Join j4=new Join();
Thread th=new Thread(j1);
Thread th1=new Thread(j2);
Thread th2=new Thread(j3);
Thread th3=new Thread(j4);
th.start();
th.setName("A");

try
{
th.join();

}

catch(Exception e)
{
System.out.println(e);




}


th1.start();
try{th1.sleep(7000);}catch(Exception e){System.out.println("sleep b=");}
th1.setName("b");

th2.start();
th2.setName("C");
try{th2.join();}catch(Exception e){System.out.println("join now in c=");}
th3.start();
th3.setName("D");




//try{Thread.sleep(3000);}catch(Exception p){System.out.println(p);}
}
}
