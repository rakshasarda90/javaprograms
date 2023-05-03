package collection_Framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Case 1 Hash Map
//public class Map1 {
//
//	public static void main(String[] args) 
//	{
//		Map map=new HashMap();
//		map.put(101, "abc");
//		map.put(102, "xyz");
//		map.put(101, "www");
//		map.put(103, "www");
//		
//		System.out.println(map);	//{101=www, 102=xyz, 103=www}	
//	}
//
//}

//Case 2
//public class Map1 {
//
//	public static void main(String[] args) 
//	{
//		Map map=new HashMap();
//		map.put(101, "abc");
//		map.put(102, "xyz");
//		map.put(101, "www");
//		map.put(103, "www");
//		map.put(null, "pqr");
//		System.out.println(map);	//{null=pqr, 101=www, 102=xyz, 103=www}
//		
//		map.put(null, "rst");
//		System.out.println(map);	//{null=rst, 101=www, 102=xyz, 103=www}
//		
//		map.put(104, null);
//		map.put(105, null);		
//		System.out.println(map); 	//{null=rst, 101=www, 102=xyz, 103=www, 104=null, 105=null}
//		
//		map.put("deepika","raksha");
//		System.out.println(map);	//{null=rst, 101=www, 102=xyz, 103=www, 104=null, 105=null, deepika=raksha}
//		
//	}
//
//}


//Case 3 Hash Table
//public class Map1 {
//
//	public static void main(String[] args) 
//	{
//		Map map=new Hashtable();
//		map.put(101, "abc");
//		map.put(102, "xyz");
//		map.put(101, "www");
//		map.put(103, "www");
////		map.put(null, "pqr");	//error
//		
//		System.out.println(map);	//{103=www, 102=xyz, 101=www}
//		
////		map.put(null, "rst");	//error
//		
////		map.put(104, null);		//error
////		map.put(105, null);		//error
//		
//		map.put("deepika","raksha");	//error
//		System.out.println(map);	//{deepika=raksha, 103=www, 102=xyz, 101=www}
//	}
//
//}


//Case 4 Synchronized version
//public class Map1 {
//
//	public static void main(String[] args) 
//	{
//		Map map=new HashMap();
//		Map m2=Collections.synchronizedMap(map);
//		map.put(101, "abc");
//		map.put(102, "xyz");
//		map.put(101, "www");
//		map.put(108, "pqr");
//		map.put(103, "www");
//		map.put("deepika","raksha");
//		System.out.println(map);	//{101=www, 102=xyz, 103=www, 108=pqr, deepika=raksha}
//	}
//
//}


//Case 5 LinkedHashMap
//public class Map1 {
//
//	public static void main(String[] args) 
//	{
//		Map map=new LinkedHashMap();
//		
//		map.put(101, "abc");
//		map.put(102, "xyz");
//		map.put(108, "www");
//		map.put(103, "www");
//		map.put("deepika","raksha");
//		System.out.println(map);	//{101=abc, 102=xyz, 108=www, 103=www, deepika=raksha}
//	}
//
//}


//Case 6 Identity HashMap
//public class Map1{
//	public static void main(String args[])
//	{
//		Map obj1=new HashMap();		//it will compare with equals() method so it will check content(10)
//		Integer I1=new Integer(10);
//		Integer I2=new Integer(10);
//		obj1.put(I1,"abc");
//		obj1.put(I2,"xyz");
//		System.out.println(obj1); 	//{10=xyz}
//	}
//}


//public class Map1{
//	public static void main(String args[])
//	{
//		Map obj1=new IdentityHashMap();		//it will compare with == operator so it will check reference
//		Integer I1=new Integer(10);
//		Integer I2=new Integer(10);
//		obj1.put(I1,"abc");
//		obj1.put(I2,"xyz");
//		System.out.println(obj1); 	//{10=abc, 10=xyz}
//	}
//}


//Case 7 Sorted Map ----> Tree Map

public class Map1{
	public static void main(String args[])
	{
		Map obj1=new TreeMap();		
		obj1.put(101,"abc");
		obj1.put(110,"xyz");
		obj1.put(109,"www");
		System.out.println(obj1);	//{101=abc, 109=www, 110=xyz}
		
		obj1.put(108,"www");
		System.out.println(obj1); 	//{101=abc, 108=www, 109=www, 110=xyz}
		
		obj1.put(108,"pqr");
		System.out.println(obj1); 	//{101=abc, 108=pqr, 109=www, 110=xyz}
		
//		obj1.put(null,"pqr");		//NullPointerException
//		System.out.println(obj1);
		
		obj1.put(112, null);
		System.out.println(obj1); 	//{101=abc, 108=pqr, 109=www, 110=xyz, 112=null}
		
		obj1.put(113, null);
		System.out.println(obj1); 	//{101=abc, 108=pqr, 109=www, 110=xyz, 112=null, 113=null}
	}
}





