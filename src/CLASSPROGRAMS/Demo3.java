package CLASSPROGRAMS;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.*;

public class Demo3 
{
	public static void main(String[] args) 
	{
		
		//LinkedHashSet<Integer> obj1=new LinkedHashSet<Integer>();
		//HashSet<Integer> obj1=new LinkedHashSet<Integer>();
		SortedSet obj1=new TreeSet();
		
		
		//obj1.add("100");
		
		//obj1.add("200");
		//obj1.add("bsx");
		//obj1.add("raksha");
		//obj1.add(null);
		//obj1.add("a");
		//obj1.add("A");
		obj1.add(new StringBuffer ("A"));
		obj1.add(new StringBuffer ("Z"));
		System.out.println(obj1);
		String str=new String("ABC");
		//System.out.println(str instanceOf Comparable);
		//System.out.println(obj1.comparator());
	}
}
