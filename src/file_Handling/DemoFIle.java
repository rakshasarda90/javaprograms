package file_Handling;

import java.io.File;
import java.io.IOException;

//Case 1
//public class DemoFIle {
//
//	public static void main(String[] args) throws IOException 
//	{
//		File f=new File("Raksha.txt");
//		System.out.println(f.exists());	//false
//		f.createNewFile();
//		System.out.println(f.exists());	//true
//
//	}
//
//}

//Case 2
//public class DemoFIle {
//
//	public static void main(String[] args) throws IOException 
//	{
//		File f=new File("cdac","Raksha.txt");
//		System.out.println(f.exists());	//false
//		f.createNewFile();
//		System.out.println(f.exists());	//true
//
//	}
//
//}

//Case 3
//public class DemoFIle {
//
//	public static void main(String[] args) throws IOException 
//	{
//		File f=new File("cdac");
//		File f1=new File(f,"Eshu.txt");
//		System.out.println(f.exists());	//false
//		f1.createNewFile();
//		System.out.println(f.exists());	//true
//
//	}
//
//}

//Case 4
//public class DemoFIle {
//
//	public static void main(String[] args) throws IOException 
//	{
//		int count=0;
//		File f=new File("cdac");
//		String s[]=f.list();
//		for(String s1: s)
//		{
//			count++;
//			System.out.println(s1);
//		}
//		System.out.println(count);	//true
//
//	}
//
//}
//Output:- Eshu.txt
//Raksha.txt
//2



