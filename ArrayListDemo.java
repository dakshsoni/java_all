import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.List;
class ArrayListDemo
{
public static void main(String s[])
{
ArrayList<String> al=new ArrayList<String>();

System.out.println("adding object inside ArrayList using add() method of Collection interface");
	al.add("mukesh");
	al.add("suresh");
	al.add("jatin");
	System.out.println(al);
System.out.println("adding object inside ArrayList using add(int index, Collection c); method of List interface"); 
	al.add(3,"japan");
	al.add(4,"harlal");
	al.add(5,"japan");
	System.out.println(al);
System.out.println("getting object from collection one by one using listIterator(); method");
ListIterator<String> li=al.listIterator();


System.out.println(li.nextIndex());// pointing the cursor position

//li.set("suresh","ramkishor");
while(li.hasNext())
{
System.out.println(li.next());
}
System.out.println("adding object inside collection using add method of ListIterator interface");
li.add("rahul-gandhi");
System.out.println(al);
System.out.println("replace object inside collection using add method of ListIterator interface");
while(li.hasPrevious())
{
	System.out.println(li.previous());
}

String str="mukesh";
if(al.contains(str))
{
	
	li.set("rohan");
}
System.out.println(al);String str1="japan";
for(int i=0;i<al.size();i++)
{
if(str1.equals(li.next()))
{

	li.remove();
	}
}
System.out.println(al);
}
}