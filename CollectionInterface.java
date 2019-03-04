import java.util.ArrayList;
import java.util.Iterator;
class CollectionInterface
{
	public static void main(String s[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		/*ArrayList<Float> al1=new ArrayList<Float>();
		ArrayListn<String> al2=new ArrayList<String>();
		ArrayListn<E> al3=new ArrayList<E>();*/
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
 }