package CLASSPROGRAMS;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo2 
{
	public static void main(String[] args) 
	{
		
		//LinkedHashSet<Integer> obj1=new LinkedHashSet<Integer>();
		//HashSet<Integer> obj1=new LinkedHashSet<Integer>();
		SortedSet obj1=new TreeSet();
		
		//obj1.add("zzz");
		obj1.add("100");
		//obj1.add("aaa");
		obj1.add("200");
		obj1.add("bsx");
		obj1.add("raksha");
		//obj1.add("Raksha");
		System.out.println(obj1);
	}
}
