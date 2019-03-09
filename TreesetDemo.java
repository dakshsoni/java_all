import java.util.TreeSet;


class Student implements Comparable
{
String name;
int id;
Student(String name,int id)
{
this.name=name;
this.id=id;
}
public int compareTo(Object o)
{
	if(o instanceof Object)
	{
		Student st=(Student)o;
		if(this.id>st.id)
		{
			return 1;// move left
		}
		if(this.id<st.id)
		{
			return -1;// move right side
		}
	}
			return 0;
		
}
public String toString()
{
return name+" "+id;
}
}
class TreeSetDemo
{
	public static void main(String s[])
	{
		TreeSet t=new TreeSet();
		
		Student st1=new Student("bjay",3);
		Student st2=new Student("jay",4);
		Student st3=new Student("ajay",5);
		Student st4=new Student("ajay",6);
		Student st5=new Student("ajay",1);
		Student st6=new Student("surya",1);
		
		t.add(st1);
		t.add(st2);
		t.add(st4);
		t.add(st3);
		t.add(st6);
		t.add(st5);
		System.out.println(t);
	}
	
}

