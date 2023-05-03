package Exception_Handling;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			String s1=args[0];
//			String s2=args[1];
//			int x=Integer.parseInt(s1);	
//			int y=Integer.parseInt(s2);	
//			int z=x/y;
//			//System.out.println("Value of z is: "+z);
//			System.out.println("try end");
//		}
//		catch(ArrayIndexOutOfBoundsException rr)
//		{
//			System.out.println("Aree bhaiya check index also");
//		}
//		catch(NumberFormatException aa)
//		{
//			System.out.println("Aree bhaiya naam nhi chalega");
//		}
//		catch(ArithmeticException kk)
//		{
//			System.out.println("Aree bhaiya zero se divide nhi hoga");
//		}
//		System.out.println("Some work is going on...");
//	}
//}
//50 raksha
//when we give one value and one string value NumberFormatException is occured
//---
//when we don't give value NumberFormatException is occured
//50 0
//when we give that value then ArithematicException occured

//case 2
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			String s1=args[0];
//			String s2=args[1];
//			int x=Integer.parseInt(s1);	
//			int y=Integer.parseInt(s2);	
//			int z=x/y;
//			//System.out.println("Value of z is: "+z);
//			System.out.println("try end");
//		}
//		catch(ArrayIndexOutOfBoundsException rr)
//		{
//			System.out.println("Aree bhaiya check index also");
//		}
//		catch(NumberFormatException aa)
//		{
//			System.out.println("Aree bhaiya naam nhi chalega");
//		}
//		catch(ArithmeticException kk)
//		{
//			System.out.println("Aree bhaiya zero se divide nhi hoga");
//		}
//		finally
//		{
//			System.out.println("Closing files");
//		}
//		System.out.println("Some work is going on...");
//	}
//}

//case 3
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			String s1=args[0];
//			String s2=args[1];
//			int x=Integer.parseInt(s1);	
//			int y=Integer.parseInt(s2);	
//			int z=x/y;
//			//System.out.println("Value of z is: "+z);
//			System.out.println("try end");
//		}
//		catch(NumberFormatException aa)
//		{
//			System.out.println("Aree bhaiya naam nhi chalega");
//		}
//		catch(Exception cc)
//		{
//			System.out.println("Parent class exception");
//		}
//		
//		System.out.println("Some work is going on...");
//	}
//}
//we have to write catch block in ascending order of their inheritance

//case 4
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			String s1=args[0];
//			String s2=args[1];
//			int x=Integer.parseInt(s1);	
//			int y=Integer.parseInt(s2);	
//			int z=x/y;
//			//System.out.println("Value of z is: "+z);
//			System.out.println("try end");
//		}
//		catch(ArrayIndexOutOfBoundsException | NumberFormatException aa)
//		{
//			System.out.println("Aree bhaiya naam nhi chalega");
//		}
//		catch(Exception cc)
//		{
//			System.out.println("Parent class exception");
//		}
//		
//		System.out.println("Some work is going on...");
//	}
//}

//case 5
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			String str=null;
//			int l=str.length();
//			System.out.println("try end");
//		}
//		catch(NullPointerException | NumberFormatException aa)
//		{
//			System.out.println("Aree bhaiya naam nhi chalega");
//		}
//		finally
//		{
//			System.out.println("Closing files");
//		}
//	}
//}

//case 6
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//	
//			System.out.println("try end");
//		}
//		catch(FileNotFoundException aa)	//error
//		{
//			System.out.println("Aree bhaiya naam nhi chalega");
//		}
//		finally
//		{
//			System.out.println("Closing files");
//		}
//	}
//}
//error Unreachable catch block for FileNotFoundException. 
//This exception is never thrown from the try statement body

//case 7
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			PrintWriter pw=new PrintWriter("qqq.txt");//without try catch error Unhandled exception type FileNotFoundException
//			pw.write("byeee");
//			System.out.println("try end");
//		}
//		catch(FileNotFoundException ss)
//		{
//			System.out.println("Aree bhaiya checked hai..");
//		}
//		System.out.println("Some work is going on...");
//	}
//}
//output
//Welcome
//try start
//try end
//Some work is going on...


//case 8
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			PrintWriter pw=new PrintWriter("qqq.txt");//without try catch error Unhandled exception type FileNotFoundException
//			pw.write("byeee");
//			System.out.println("try end");
//		}
//		catch(Exception ss)
//		{
//			System.out.println("Aree bhaiya checked hai..");
//		}
//		System.out.println("Some work is going on...");
//	}
//}
//output
//Welcome
//try start
//try end
//Some work is going on...

//case 9
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		try
//		{
//			System.out.println("try start");
//			int x=100;
//			//int y=args[0];
//			System.out.println(x);
//		}
//		catch(Exception ss)
//		{
//			x=200;	//x cannot be resolved to a variable
//			System.out.println();
//		}
//		System.out.println("Some work is going on...");
//	}
//}
//error x cannot be resolved to a variable

//case 10
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			int x=str.length();
//			System.out.println(x);
//			return 80;
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		//return 60; //error Unreachable statement
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//30

//case 11
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			//int x=str.length();
//			//System.out.println(x);
//			return 80;
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		//return 60; //error Unreachable statement
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//80

//case 12
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			//int x=str.length();
//			//System.out.println(x);
//			
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		return 60; //error Unreachable statement
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//60

//case 13
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str="raksha";
//			int x=str.length();
//			System.out.println(x);
//			return 80;
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		//return 60; //error Unreachable statement
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//6
//80

//case 14
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			int x=str.length();
//			System.out.println(x);
//			return 80;
//		}
//		catch(ArrayIndexOutOfBoundsException uu)
//		{
//			
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		System.out.println("Party");
//		return 60; 
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//30

//case 15
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			int x=str.length();
//			System.out.println(x);
//			return 80;
//		}
//		catch(ArrayIndexOutOfBoundsException uu)
//		{
//			return 76;
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		//System.out.println("Party");
//		//return 60; 
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//30

//case 16
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			int x=str.length();
//			System.out.println(x);
//			return 80;
//		}
//		catch(ArrayIndexOutOfBoundsException uu)
//		{
//			return 76;
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		finally
//		{
//			System.out.println("Party");
//		}
//		//return 60; 
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//Party
//30


//case 17
//class A
//{
//	 int test()
//	 {
//		 try
//		{
//			String str=null;
//			//int x=str.length();
//			//System.out.println(x);
//			return 80;
//		}
//		catch(ArrayIndexOutOfBoundsException uu)
//		{
//			return 70;
//		}
//		catch(Exception ss)
//		{
//			return 30;
//		}
//		finally
//		{
//			System.out.println("Party");
//			return 60; 
//		}
//		
//	 }
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A obj1=new A();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//Party
//60

