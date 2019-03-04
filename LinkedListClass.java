import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
class LinkedListClass
{
	public static void main(String s[]) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("mohit");
		ll.add("suresh");
		ll.add("pawan");
		System.out.println(ll);
		System.out.println("*******************************************");
					//getting object one by one using for loop
					for(int i=0;i<ll.size();i++)
					{
						System.out.println(ll.get(i));
					}
					System.out.println("*******************************************");
					//getting object one by one using iterator(only move in forward direction ,only we can remove and read operation in Iterator)
					Iterator it=ll.iterator();
						while(it.hasNext())
						{

							System.out.println(it.next());
						}
		System.out.println("**************Remove perticular index from linkedlist*****************************");
		ll.remove(0);
	
		System.out.println(ll);
						System.out.println("**************now adding again in linkedlist*****************************");
								ll.addFirst("deepak");
								ll.add("ajay");
								ll.add("amit");
								ll.add("jay");
								ll.add("ajay");
						System.out.println("**************now insertion in middle in linkedlist is the best case*****************************");
								ll.add(0,"dinu");
				// passing direct value or object which you want to remove
				ll.remove(new String("deepak"));
				System.out.println(ll);
		/*while(it.hasPrevious())
		{                                                
			System.out.println(it.previous());                           cann't find symbol 
		}*/
		
		
		
		
		
		// getting object one by one using ListIterator(move by-directional,we can add,read,remove and replace in listIterator)
		// it print hashcode of the object where it stored
	
		
		// powerfull cursor in java known as ListIterator....
		
		System.out.println("*****************move forward direction using ListIterator**************************");
									ListIterator lt=ll.listIterator();
									while(lt.hasNext())
									{
										System.out.println(lt.next());
									}
		System.out.println("*****************move backward direction using ListIterator**************************");
									while(lt.hasPrevious())
									{
										System.out.println(lt.previous());
									}
									System.out.println(ll);
		System.out.println("*************we are perform remove operation using ListIterator*****************************");
									while(lt.hasNext())
									{
										String str=(String)lt.next();
										String str1="pawan";
										if(str.equals(str1))
										{
											lt.remove();
										}
										
									}
									System.out.println(ll);
		System.out.println("*************we are perform add operation using ListIterator*****************************");
		
									lt.add("sandy");
									System.out.println(ll);
	}
}