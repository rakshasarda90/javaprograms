package object_Class;

import java.util.Objects;

//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	public String toString()
//	{
//		return id+":"+name;
//	}
////	public boolean equals(Person p)
////	{
////		Person p5=p;
////		//return this.id==p.id && this.name.equals(p.name);
////		return this.id==p5.id && this.name.equals(p5.name);
////	}
//}
//
//public class Demo2 
//{
//	public static void main(String[] args) 
//	{
//		Person p1=new Person(101,"abc");
//		Person p2=new Person(101,"abc");
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());	
//		System.out.println(p1.hashCode()==p2.hashCode());
//	}
//}
//output
//240650537
//488970385
//false

//case 2
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	Person()
//	{
//		
//	}
//	public int hashcode()
//	{
//		return id;
//	}
////	public String toString()
////	{
////		return id+":"+name;
////	}
//	
////	public boolean equals(Person p)
////	{
////		//Person p5=p;
////		return this.id==p.id && this.name.equals(p.name);
////		//return this.id==p5.id && this.name.equals(p5.name);
////	}
//}
//
//public class Demo2 
//{
//	public static void main(String[] args) 
//	{
//		Person p1=new Person(101,"abc");
//		Person p2=new Person(101,"abc");
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());	
//		System.out.println(p1.hashCode()==p2.hashCode());
//		System.out.println(p1);
//	}
//}
//output
//false
//System.out.println(p1

//case 3
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	Person()
//	{
//		
//	}
////	public int hashcode()
////	{
////		return id;
////	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//	
////	public String toString()
////	{
////		return id+":"+name;
////	}
//	
////	public boolean equals(Person p)
////	{
////		//Person p5=p;
////		return this.id==p.id && this.name.equals(p.name);
////		//return this.id==p5.id && this.name.equals(p5.name);
////	}
//}
//
//public class Demo2 
//{
//	public static void main(String[] args) 
//	{
//		Person p1=new Person(101,"abc");
//		Person p2=new Person(101,"abc");
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());	
//		System.out.println(p1.hashCode()==p2.hashCode());
//		System.out.println(p1);
//	}
//}
//output
//100446
//100446
//true
//object_Class.Person@1885e









