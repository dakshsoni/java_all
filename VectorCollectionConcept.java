import java.util.Vector;
import java.util.Enumeration;  
/*
vector class is synchronized and default capacity =10,we can also increment capacity of vector (int initialCapacity,int incrementalCapacity);
let's we fixed initial capacity=50 now one more element is to be inserting so we can increment capacity by=1 so that no memory wasted this we can't do in ArrayList.
default capacity of vector=10 and new capacity after element inserted at 11 position =   "2*current capacity=20"
*/ 

class VectorCollectionConcept
{
	// Enumeration Interface only applicable for legacy classes , we can only perform read operation in Enumeration
	Vector<Integer> v =new Vector<Integer>(22);
	Vector v1 =new Vector();
	public synchronized void method()
		{
		// creating a object of Vector class
		
		
		v.addElement(1);
		v.addElement(0);
		v.addElement(2);
		v.addElement(1);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		this.method2();
		v.addElement(7);
		v.addElement(8);
		v.addElement(9);
		v.addElement(20);
		// remove objects from vector at index 
		v.remove(0);
		System.out.println("After remove index 0:"+v);
		System.out.println(v.capacity());
		
		}
		public synchronized void method2()
		{
			System.out.print("*****getting object one by one using enumeration:");
		Enumeration e=v.elements();//To get object one by one using Enumeration
		while(e.hasMoreElements())
		{
			System.out.print( "  "+e.nextElement() );
		}
		System.out.println("************cloning of object*************");
		
		v1=(Vector)v.clone();
		System.out.println(v1);
		

		}		
		public static void main(String s[])
	{
		VectorCollectionConcept vcc=new VectorCollectionConcept();
		vcc.method();
		
		
		
		
	}
}