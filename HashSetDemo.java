import java.util.HashSet;
import java.util.Iterator;

class Student
{


String name;
int id;
Student(String name,int id)
{
this.name=name;
this.id=id;
} 
public int hashCode()
{
return id;
}
/*
public boolean contains(object ob)
{
if(this.hashCode()==ob.hashCode())
{
this.equals(ob);
}
}
*/
public boolean equals(Object ob1)
{
if(ob1 instanceof Student)
{
Student st=(Student)ob1;
if(this.id==st.id)
{
return true;
}
}

return false;


}


public String toString()
{
return name+ " " +id;	
}
}
class HashSetDemo
{
	
public static void main(String s[])
{
HashSet<Student>hs=new HashSet<Student>();
/* internally HashSet class Working
class Hashset implements HashMap extends set
{
	object obj;
	HashMap map;
	HashSet()
	{
		map=new HasMap();
		obj=new Object();
	}
	public boolean add(Object ob)
	{
		map.put(ob,obj);// where obj == value(constant) and ob == key;
	}
}

*/

Student st1=new Student("deepak",1);
Student st2=new Student("deepak",2);
Student st3=new Student("rahul",1);
Student st4=new Student("deep",3);
hs.add(st1);
hs.add(st2);
hs.add(st3);
hs.add(st4);
System.out.println(hs);
hs.remove(st4);
System.out.println(hs);
}
}