class A
{
public static void main(String ...s)
{
B b= new B();
b.start();
synchronized(b)
{
System.out.println("main thread trying to call wait()");
try
{
b.wait(1000);
}
catch(Exception e)
{
System.out.println("main thread get notification");

}
System.out.println(b.total);
}
}
}
class B extends Thread
{
int total=0;
public void run()
{
synchronized(this)
{
System.out.println("child thread start notification");
for(int i=0;i<10;i++)
{


total+=i;
}
System.out.println("child thread trying to give notification");
//this.notify();
}

}
}