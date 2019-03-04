class Test
{
	private static Test t;
	private int x;
	private Test(int val)
	{
	x=val;
	}
	void show()
	{
	System.out.println(x);
	System.out.println(t);
	}
		public static Test Rohit(int z)
		{
		if(t==null)
		{
		t=new Test(z);
		}
		return t;
		}

}
class Demo
{
public static void main(String s[])
{
Test t1,t2;
t1=Test.Rohit(10);
t1.show();
t2=Test.Rohit(20);
t2.show();

}
}