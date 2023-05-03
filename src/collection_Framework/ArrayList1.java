package collection_Framework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;


//case 1
//public class ArrayList1 {
//
//	public static void main(String[] args) 
//	{
//		ArrayList obj1=new ArrayList();
//		obj1.add(100);
//		obj1.add(20.45);
//		obj1.add("hello");
//		System.out.println(obj1);
//	}
//
//}
//Output:- [100, 20.45, hello]

//Case 2
//public class ArrayList1{
//	public static void main(String[] args)
//	{
//		ArrayList<String> obj1=new ArrayList<String>();
//		obj1.add("Hello");
//		obj1.add("Raksha");
//		obj1.add("Hello");
//		obj1.add("Eshuu");
//		System.out.println(obj1);
//	}
//}
//Output:- [Hello, Raksha, Hello, Eshuu]

//Case 3
//public class ArrayList1{
//	public static void main(String [] args) {
//		ArrayList<Integer> obj1=new ArrayList<Integer>();
//		obj1.add(500);
//		obj1.add(400);
//		obj1.add(300);
//		obj1.add(200);
//		obj1.add(100);
//		obj1.add(500);
//		System.out.println(obj1);
//	}
//}
//Output:- [500, 400, 300, 200, 100, 500]

//Methods of List
//1.add(int index,object o);
//2.addall(int index,collection c);
//3.remove(int index);
//4.get(int index);
//5.set(int index);
//6.indexOf(object o); ------> Index of first object
//7.lastIndexOf(object o); ------>Last index of object


//Case 4
//public class ArrayList1{
//	public static void main(String[] args)
//	{
//		ArrayList<Integer> obj1=new ArrayList<Integer>();
//		obj1.add(500);
//		obj1.add(400);
//		obj1.add(300);
//		System.out.println("Object 1: "+obj1);
//		
//		ArrayList<Integer> obj2=new ArrayList<Integer>();
//		obj2.addAll(obj1);
//		obj2.add(200);
//		System.out.println("Object 2: "+obj2);
//		System.out.println(obj1.containsAll(obj2)); //false obj1 not contain all object of obj2
//		System.out.println(obj2.containsAll(obj1)); //true obj2 contain all object of obj1
//		
//		
//		obj1.add(600);
//		obj2.add(900);
//		System.out.println("Object 1: "+obj1);
//		System.out.println("Object 2: "+obj2);
//		System.out.println(obj1.retainAll(obj2));	//true
//		System.out.println(obj2.retainAll(obj1));	//true
//		System.out.println("Object 1: "+obj1);
//		System.out.println("Object 2: "+obj2);
//	}
//}
//Output:-
//Object 1: [500, 400, 300]
//Object 2: [500, 400, 300, 200]
//false
//true
//Object 1: [500, 400, 300, 600]
//Object 2: [500, 400, 300, 200, 900]
//true
//true
//Object 1: [500, 400, 300]
//Object 2: [500, 400, 300]

//Case 5
//class Person{
//	int id;
//	String name;
//	Person(int id, String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	Person()
//	{
//		
//	}
//	public String toString()
//	{
//		return id+":"+name;
//	}
//}
//public class ArrayList1{
//	public static void main(String[] args)
//	{
//		Person p1=new Person(101,"albert");
//		Person p2=new Person(102,"abc");
//		Person p3=new Person(102,"abc");
//		
//		ArrayList<Person> obj1=new ArrayList<Person>();
//		obj1.add(p1);
//		obj1.add(p2);
//		obj1.add(p3);
//		System.out.println("Person: "+obj1);
//		System.out.println(p2==p3);
//		System.out.println(p2.equals(p3));
//	}
//}
//Output:-
//Person: [101:albert, 102:abc, 102:abc]
//false
//false


//Case 6
//public class ArrayList1{
//public static void main(String[] args)
//{
//	ArrayList<String> obj1=new ArrayList<String>();
//	obj1.add("Hello");
//	obj1.add("Raksha");
//	obj1.add("Hello");
//	obj1.add("Eshuu");
//	System.out.println(obj1 instanceof Cloneable);
//	System.out.println(obj1 instanceof Serializable);
//	System.out.println(obj1 instanceof RandomAccess);
//
//	System.out.println(obj1);
//}
//}




