package collection_Framework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

//Case 1 Enumeration
//public class Cursors {
//	
//
//		public static void main(String[] args) 
//		{
//			Vector<Integer> obj1=new Vector<Integer>();
//			obj1.add(10);
//			obj1.add(20);
//			obj1.add(35);
//			obj1.add(40);
//			System.out.println(obj1);
//			
//			Enumeration e=obj1.elements();
//			while(e.hasMoreElements())
//			{
//				Integer i=(Integer)e.nextElement();
//				if(i%2==0)
//					System.out.println(i);
//			}
//		}
//}

//Case 2 Iterator
//public class Cursors {
//
//	public static void main(String[] args) 
//	{
//		Vector<Integer> obj1=new Vector<Integer>();
//		obj1.add(10);
//		obj1.add(20);
//		obj1.add(35);
//		obj1.add(47);
//		System.out.println(obj1);
//		
//		Iterator e=obj1.iterator();
//		while(e.hasNext())
//		{
//			Integer i=(Integer)e.next();
//			if(i%2==0)
//				System.out.println(i);
//			else
//				e.remove();
//		}
//	}
//}
//Output:-
//[10, 20, 35, 47]
//10
//20

//Case 3 List Iterator
public class  Cursors{
	public static void main(String args[])
	{
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("abc");
		obj1.add("xyz");
		obj1.add("www");
		obj1.add("yyy");
		System.out.println(obj1);
		ListIterator e=obj1.listIterator();
		while(e.hasNext())
		{
			String s=(String)e.next();
			if(s.equals("yyy"))
				e.remove();
			else if(s.equals("www"))
				e.add("zzz");
			else if(s.equals("abc"))
				e.set("raksha");
			
					
		}
		System.out.println(obj1);
	}
}
//Output:-
//[abc, xyz, www, yyy]
//[raksha, xyz, www, zzz]

