package collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

//Case 1  HashSet String
//public class Set1 {
//
//	public static void main(String[] args) 
//	{
//		HashSet<String> obj1=new HashSet<String>();
//		obj1.add("abc");
//		obj1.add("xyz");
//		obj1.add("www");
//		obj1.add("yyy");
//		obj1.add("abc");
//		obj1.add(null);		//[null, abc, www, xyz, yyy]
//		obj1.add(null);		//only single null value can be inserted
//		System.out.println(obj1);
//	}
//
//}
//Output:- [abc, www, xyz, yyy]  Duplicates are not allowed and insertion order is also not preserved

//Case 2  HashSet Object
//class Person{
//	
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//		
//	}
//	Person()
//	{
//		
//	}
//	
//	@Override
//	public int hashCode() 
//	{
//		return Objects.hash(id);
//	}
//	
//	@Override
//	public boolean equals(Object obj) 	//[101:raksha, 102:abc]
//	{
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return id == other.id;
//	}
//	
//	public String toString()
//	{
//		return id+":"+name;
//	}
//}
//public class Set1 {
//
//	public static void main(String[] args) 
//	{
//		HashSet<Person> obj1=new HashSet<Person>();
//		Person p1=new Person(101,"raksha");
//		Person p2=new Person(102,"abc");
//		Person p3=new Person(101,"Raksha");
//		obj1.add(p1);
//		obj1.add(p2);
//		obj1.add(p3);
//		System.out.println(obj1);
//	}
//
//}
//Output:-[101:raksha, 101:Raksha, 102:abc]


//Case 3 LinkedHashSet
//public class Set1{
//	public static void main(String args[])
//	{
//		LinkedHashSet<Integer> obj1=new LinkedHashSet<Integer>();//HashSet<Integer> obj1=new LinkedHashSet<Integer>();
//		obj1.add(100);
//		obj1.add(200);
//		obj1.add(300);
//		obj1.add(100);
//		System.out.println(obj1);
//	}
//}
//Output:-[100, 200, 300]

//Case 4 Sorted Set
//public class Set1{
//	public static void main(String args[])
//	{
//		SortedSet<Integer> obj1= new TreeSet<Integer>();
//		obj1.add(100);
//		obj1.add(101);
//		obj1.add(104);
//		obj1.add(106);
//		obj1.add(110);
//		obj1.add(115);
//		obj1.add(120);
//		System.out.println(obj1);	//[100, 101, 104, 106, 110, 115, 120]
//		System.out.println(obj1.first());	//100
//		System.out.println(obj1.last());	//120
//		System.out.println(obj1.headSet(106));	//[100, 101, 104]
//		System.out.println(obj1.tailSet(106));	//[106, 110, 115, 120]
//		System.out.println(obj1.subSet(101,115));	//[101, 104, 106, 110]
//		System.out.println(obj1.comparator());	//null if default natural sorting then returns null
//	}
//}


//Case 5 Tree Set
//public class Set1{
//	public static void main(String args[])
//	{
//		SortedSet<Integer> obj1= new TreeSet<Integer>();
//		obj1.add(103);
//		obj1.add(100);
//		obj1.add(300);
//		obj1.add(86);
//		obj1.add(48);
//		obj1.add(115);
//		obj1.add(95);
//		System.out.println(obj1);	//[48, 86, 95, 100, 103, 115, 300]
//	}
//}


//Caase 6
//public class Set1{
//	public static void main(String args[])
//	{
//		SortedSet obj1= new TreeSet();
//		obj1.add("zzz");
//		obj1.add("aaa");
//		obj1.add("bsx");
//		obj1.add("raksha");
//		obj1.add("eshu");
//		obj1.add("mrunal");
//		obj1.add("rajsha");
//		System.out.println(obj1);	//[aaa, bsx, eshu, mrunal, rajsha, raksha, zzz]
//	}
//}


//Case 7
//public class Set1{
//	public static void main(String args[])
//	{
//		SortedSet obj1= new TreeSet();
//		obj1.add("235");
//		obj1.add("600");
//		obj1.add("300");
//		obj1.add("raksha");
//		obj1.add("240");
//		obj1.add("19");
//		obj1.add("rajsha");
//		System.out.println(obj1);	//[19, 235, 240, 300, 600, rajsha, raksha]
//	}
//}


//public class Set1{
//	public static void main(String args[])
//	{
//		SortedSet obj1= new TreeSet();
//		obj1.add("a");
//		obj1.add("A");
//		System.out.println(obj1);	//[A, a]
//	}
//}




