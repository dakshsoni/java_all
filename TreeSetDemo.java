import java.util.TreeSet;
/*
TreeSet -> it is concrete class. when we creating object of TreeSet it internally create a "BST" binary search tree where elements traverse in pre-order,post-Order, or in in-Order. as we know in whole collection three only two classes are there which can not applicable for heteroginous objects.
or we can understanding insertion is in Dictionary order(alphabetic,numbers,or String{a,ab,abc,abcd,abcde.....})
*/


class TreeSetDemo
{
	public static void main(String s[])
	{
		TreeSet t=new TreeSet();
	System.out.println("addind int type elements inside TreeSet");
				t.add(2);
				t.add(1);
				t.add(7);
				t.add(4);
				t.add(1);
		System.out.println(t);
		
		
		
		TreeSet t1=new TreeSet();
		System.out.println("addind Sting type elements inside TreeSet");
				t1.add("raman");
				t1.add("aman");
				t1.add("raju");
				t1.add("raju");
				t1.add("kamal");
		System.out.println(t1);
		
	/*	System.out.println("now we try to to crete clone of t");
		TreeSet t2=new TreeSet(t);
		System.out.println(t2);
		System.out.println("now we try to add string inside in t2 :"+" "+"as we know TreeSet not Allow Hetergenous data type");
		t2.add("ajay");
		System.out.println(t2);*/
		
	}
}