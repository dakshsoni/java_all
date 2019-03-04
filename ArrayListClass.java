import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.*;

class ArrayListClass
{
	// this method use to print capacity of ArrayList initial capacity =10;
	public static int cap(ArrayList a) throws Exception
		{
			Field f=ArrayList.class.getDeclaredField("elementData");
			f.setAccessible(true);
			return((Object[])f.get(a)).length;	
		}
	public static void main(String s[])throws Exception
	{
		ArrayList<Integer> al=new ArrayList<Integer>(20);//only int type object can store and we maintion here initial capacity of ArrayList
		
		ArrayList<Float> al1=new ArrayList<Float>();
		ArrayList<String> al2=new ArrayList<String>();
		ArrayList al3=new ArrayList();//non generic type in which we can multiple data type
		for(int i=0;i<6;i++)//add object inside arrayList
		{
			al.add(i);
		}
		
System.out.println("capacity="+cap(al));
		//adding object inside al3 ArrayList
		al3.add("amit");
		al3.add('c');
		al3.add(10.5F);
		Iterator it=al.iterator();        //get objects from ArrayList one by one
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(int i=0;i<al3.size();i++)    //getting objects from ArrayList al3;
		{
			System.out.println(al3.get(i));
		}
		// add all from al3 to al
		al.addAll(al3);
		System.out.println("al"+al);
		
		al2.add("1");
		//al2.add(1);            ------- exception int can not converted to string
		System.out.println("al2"+al2);
		
		
		
		
		al1.add(10.0F);
		float f[]=new float [3];
		f[0]=0.0F;
		for(int i=0;i<f.length;i++)
		{
			f[i]=f[i]+10.0F;
			al1.add(f[i]+1);
		}
		Iterator it1=al1.iterator();
	while(it1.hasNext())
	{
		Object ob=it1.next();
		System.out.println("al1"+ob);
	}
	
	// set value at perticular index(here we set 121 value at index 0)
	al1.set(1,121.0F);
		System.out.println(al1.get(1));
	System.out.println("*********************************************************");
	// remove object from ArrayList
	al.remove(0);
	System.out.println("al"+al);
	ArrayList l=new ArrayList();
	l=(ArrayList)al.clone();// cloning
	System.out.println(l);
	System.out.println(l.equals(al));//contents are same in both
	System.out.println(l.hashCode() +"  "+  al.hashCode());//both object are same
	//remove objects from ArrayList al but it cann't impact on Arraylist l
	al.removeAll(al);
	System.out.println(al+"   "+l);
	//is arrayList object empty or not
	System.out.println(al.isEmpty());
	//print size of ArrayList
	System.out.println(al.size());
//we can also increment the capacity of Arraylist using 
       al1.ensureCapacity(1000);
	
	   
	}
 }
