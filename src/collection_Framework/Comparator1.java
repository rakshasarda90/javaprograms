package collection_Framework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//Case 1
//class MyClass implements Comparator
//{
//	
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		Integer i1=(Integer)o1;
//		Integer i2=(Integer)o2;
//		if(i1<i2)
//			return +1;
//		else if(i1>i2)
//			return -1;
//		else
//			return 0;
//	}
//}
//public class Comparator1 {
//
//	public static void main(String[] args) 
//	{
//		SortedSet obj1=new TreeSet(new MyClass());
//		obj1.add(20);
//		obj1.add(10);
//		obj1.add(15);
//		obj1.add(5);
//		System.out.println(obj1);
//	}
//
//}
//Output:- [20, 15, 10, 5]


//Case 2
//class MyClass implements Comparator
//{
//	
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		String i1=(String)o1;
//		String i2=(String)o2;
//		return -i1.compareTo(i2);
//	}
//}
//public class Comparator1 {
//
//	public static void main(String[] args) 
//	{
//		SortedSet obj1=new TreeSet(new MyClass());
//		obj1.add("Z");
//		obj1.add("A");
//		obj1.add("B");
//		obj1.add("Y");
//		System.out.println(obj1);
//	}
//
//}
//Output:- [Z, Y, B, A]