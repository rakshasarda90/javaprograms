package file_Handling;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;


//Case 1
//public class File_Writer_Demo {
//
//	public static void main(String[] args) throws IOException
//	{
//		FileWriter fw=new FileWriter("Mayu.txt");
//		fw.write(100);
//		fw.write('a');
//		char ch[]= {'x','y','z'};
//		fw.write(ch);
//		fw.write("bye");
//		fw.flush();
//		fw.close();
//		System.out.println("done");
//	}
//
//}

//Case 2
//public class File_Writer_Demo {
//
//	public static void main(String[] args) throws IOException
//	{
//		FileWriter fw=new FileWriter("Mayu.txt",true);
//		fw.write(100);
//		fw.write('a');
//		char ch[]= {'x','y','z'};
//		fw.write(ch);
//		fw.write("bye");
//		fw.flush();
//		fw.close();
//		System.out.println("done");
//	}
//
//}

//Case 3
//public class File_Writer_Demo {
//
//	public static void main(String[] args) throws IOException
//	{
//		FileWriter fw=new FileWriter("Mayu.txt");
//		fw.write(100);
//		fw.write("\n");
//		fw.write('a');
//		fw.write("\n");
//		char ch[]= {'x','y','z'};
//		fw.write(ch);
//		fw.write("\n");
//		fw.write("bye");
//		fw.flush();
//		fw.close();
//		System.out.println("done");
//	}
//
//}

//Case 4
//public class File_Writer_Demo {
//
//	public static void main(String[] args) throws IOException
//	{
//		FileWriter fw=new FileWriter("Mayu.txt");
//		BufferedWriter br=new BufferedWriter(fw);
//		br.write(100);
//		br.newLine();
//		br.write('a');
//		br.newLine();
//		char ch[]= {'x','y','z'};
//		br.write(ch);
//		br.newLine();
//		br.write("bye");
//		br.flush();
//		br.close();
//		System.out.println("done");
//	}
//
//}

//Case 5
//public class File_Writer_Demo {
//
//	public static void main(String[] args) throws IOException
//	{
//		PrintWriter pw=new PrintWriter("Mayu.txt");
//		pw.println(12.5);
//		pw.println(100);
//		pw.println('a');
//		char ch[]= {'x','y','z'};
//		pw.println(ch);
//		pw.println("bye");
//		pw.flush();
//		pw.close();
//		System.out.println("done");
//	}
//
//}

//Case 6
//public class File_Writer_Demo {
//
//	public static void main(String[] args) throws IOException
//	{
//		FileWriter fw=new FileWriter("Mayu.txt",true);
//		PrintWriter pw=new PrintWriter(fw);
//		pw.println(12.5);
//		pw.println(100);
//		pw.println('a');
//		char ch[]= {'x','y','z'};
//		pw.println(ch);
//		pw.println("bye");
//		pw.flush();
//		pw.close();
//		System.out.println("done");
//	}
//
//}

//Case 7
//public class File_Writer_Demo {
//	public static void main(String arrgs[]) throws IOException
//	{
//		FileReader fr=new FileReader("Mayu.txt");
//		int i=fr.read();
//		while(i!=-1)
//		{
//			System.out.print((char)i);
//			i=fr.read();
//		}
//		fr.close();
//	}
//}
  
//Case 8
//public class File_Writer_Demo {
//	public static void main(String arrgs[]) throws IOException
//	{
//		FileReader fr=new FileReader("Mayu.txt");
//		char ch[]=new char[100];
//		fr.read(ch);
//		for(char ch1: ch)
//		{
//			System.out.print((char)ch1);
//		}
//		fr.close();
//	}
//}

//Case 8
public class File_Writer_Demo {
	public static void main(String arrgs[]) throws IOException
	{
		FileReader fr=new FileReader("Mayu.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		while(str!=null)
		{
			System.out.println(str);
			str=br.readLine();
		}
		fr.close();
		System.out.println("done");
	}
}

