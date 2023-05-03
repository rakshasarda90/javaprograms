package CLASSPROGRAMS;

import java.io.*;

import java.util.*;
/*
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
}*/
public class Demo1
{

	public static void main(String[] args) 
	{
		
		//LinkedHashSet<Integer> obj1=new LinkedHashSet<Integer>();
		//HashSet<Integer> obj1=new LinkedHashSet<Integer>();
		SortedSet<Integer> obj1=new TreeSet<Integer>();
		
		obj1.add(103);
		obj1.add(100);
		obj1.add(300);
		obj1.add(89);
		obj1.add(89);
		//obj1.add("Raksha");	//error
		System.out.println(obj1);
		
		
		
	}

}