package collection_Framework;

import java.util.SortedSet;
import java.util.TreeSet;


//Case 1 Comparable is parent of compareTo
public class ComparetTo1 {

	public static void main(String[] args) 
	{
		System.out.println("A".compareTo("Z"));	//-25 A has to come before Z
		System.out.println("Z".compareTo("A"));	//25 Z has to come after A
		SortedSet obj1=new TreeSet();
		obj1.add("Z");
		obj1.add("A");
		System.out.println(obj1);	//[A, Z] obj1 has to come after obj2
		
		obj1.add("A");
		obj1.add("Z");
		System.out.println(obj1);	//[A, Z] obj1 has to come before obj2 
	}

}
