import java.util.TreeSet;
import java.util.Comparator;
class IntId implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.id< s2.id)
		{
			return -1;
		}
		if(s1.id>s2.id)
		{
			return 1;
		}
		return 0;
	}
}
class StringName implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.name.compareTo(s2.name);
	}
}

class Student 

{
	String name;int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return name +" "+id;
	}
}
class TreeSetDemo
{
	public static void main(String s[])
	{
		Comparator c=new StringName();
		Comparator c1=new IntId();
		TreeSet<Student> t = new TreeSet<Student>(c);
		TreeSet<Student> t1 = new TreeSet<Student>(c1);
		Student st=new Student("deepak",2);
		Student st1=new Student("ajay",1);
		Student st2=new Student("rahul",1);
		Student st3=new Student("amit",3);
		Student st4=new Student("ajay",4);
		Student st5=new Student("bhagu",5);
		Student st6=new Student("bahq",9);
		Student st7=new Student("banty",7);
		t.add(st);
		t.add(st1);	
		t.add(st3);
		t.add(st2);
		t.add(st4);
		t.add(st7);
		t.add(st6);
		t.add(st5);	
		
		t1.add(st);
		t1.add(st1);	
		t1.add(st3);
		t1.add(st2);
		t1.add(st4);
		t1.add(st7);
		t1.add(st6);
		t1.add(st5);
		System.out.println(t);
		System.out.println(t1);
		}
}