package collection_Framework;
import java.io.Serializable;
import java.util.*;


public class Linked_List1 {

	public static void main(String[] args) 
	{
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Hello");
		obj1.add("Raksha");
		obj1.add("Hello");
		obj1.add("Eshuu");
		System.out.println("Object 1: "+obj1);
		
		LinkedList<String> obj2=new LinkedList<String>();
		System.out.println(obj2.addAll(obj1));
		System.out.println(obj2 instanceof Cloneable);
		System.out.println(obj2 instanceof Serializable);
		System.out.println(obj2 instanceof RandomAccess);
		System.out.println("Object 2: "+obj2);
		
	}

}
