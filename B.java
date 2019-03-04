class D
{
static int x;
void show()
{
x=10;
System.out.println(x);
}


}
class B
{
public static void main(String s[])
{
D a=new D();
a.show();
System.out.println(a.x);

}
}