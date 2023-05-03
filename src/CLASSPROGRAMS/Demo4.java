package CLASSPROGRAMS;

import java.util.SortedSet;
import java.util.TreeSet;

class Person
{
	int id;
	String name;
	Person(int id, String name)		//int i, String n
	{
		this.id=id;					//id=i;
		this.name=name;				//name=n;
	}
	Person()
	{
		
	}
	public String toString()
	{
		return id+":"+name;
	}
}
public class Demo4 
{

	public static void main(String[] args) 
	{
		Person p1=new Person(101,"abc");
		Person p2=new Person(102,"xyz");
		SortedSet obj1=new TreeSet();
		obj1.add(p1);
		obj1.add(p2);
		System.out.println(obj1);
	}

}
