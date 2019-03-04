class Thread1
{
Thread1 t1;
int data[] ={1,2,3,4,5,6,7,8,9,10};
synchronized void m1()
{
for(int i=0;i<10;i++)
{
data[i]+=data[i];
System.out.println(data[i]+"value:"+i);
}

}
void m2()
{
for(int i=9;i>=0;i--)
{
data[i]*=2;
System.out.println(data[i]+"digit on multiply:"+i);
}
}
}
class Mythread extends Thread
{
	Thread1 t1;
Mythread(Thread1 t1,String s2)
{
super(s2);
this.t1=t1;
start();
}
public void run()
{
String s1=getName();
System.out.println("run method call");
if(s1.equals("frist"))
{
System.out.println("frist thread start");
t1.m1();
}
else
{
System.out.println("second thread start");
t1.m2();
}
}
}
class Test
{
public static void main(String s[])
{
Thread1 t1=new Thread1();
Mythread th=new Mythread(t1,"frist");
Mythread th2=new Mythread(t1,"second");
}
}

