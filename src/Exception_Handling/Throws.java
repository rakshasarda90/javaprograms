package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//case 1 Checked example
//class X
//{
//	int test1() throws FileNotFoundException
//	{
//		test2();
//		return 10;
//	}
//	int test2() throws FileNotFoundException
//	{
//		test3();
//		return 20;
//	}
//	int test3() throws FileNotFoundException
//	{
//		PrintWriter pw=new PrintWriter("abc.txt");
//		return 30;
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) 
//	{
//		X obj1=new X();
//		try
//		{
//			System.out.println(obj1.test1());
//		}
//		catch(FileNotFoundException aa)
//		{
//			
//		}
//		System.out.println("After everything");
//	}
//
//}
//output
//10
//After everything


//case 2 unchecked example
//class X
//{
//	int test1() 
//	{
//		test2();
//		return 10;
//	}
//	int test2() 
//	{
//		test3();
//		return 20;
//	}
//	int test3() 
//	{
//		int z=10/0;
//		
//		return 30;
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) 
//	{
//		X obj1=new X();
//		try
//		{
//			System.out.println(obj1.test1());
//		}
//		catch(ArithmeticException aa)
//		{
//			System.out.println(aa.getMessage());
//		}
//		System.out.println("After everything");
//	}
//
//}
//output
/// by zero
//After everything

//case 3
//class X
//{
//	int test1() throws FileNotFoundException
//	{
//		test2();
//		return 10;
//	}
//	int test2() throws FileNotFoundException
//	{
//		test3();
//		return 20;
//	}
//	int test3() throws Exception
//	{
//		PrintWriter pw=new PrintWriter("abc.txt");
//		return 30;
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) 
//	{
//		X obj1=new X();
//		try
//		{
//			System.out.println(obj1.test1());
//		}
//		catch(FileNotFoundException aa)
//		{
//			
//		}
//		System.out.println("After everything");
//	}
//
//}
//output
//error because heirarachy will increase not to decrease

//case 4
//class X
//{
//	int test1() throws Exception
//	{
//		test2();
//		return 10;
//	}
//	int test2() throws FileNotFoundException
//	{
//		test3();
//		return 20;
//	}
//	int test3() throws FileNotFoundException
//	{
//		PrintWriter pw=new PrintWriter("abc.txt");
//		return 30;
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) 
//	{
//		X obj1=new X();
//		try
//		{
//			System.out.println(obj1.test1());
//		}
//		catch(Exception aa)
//		{
//			
//		}
//		System.out.println("After everything");
//	}
//
//}
//output
//10
//After everything

//case 5 throws with method overriding
//class X
//{
//	void test1() throws FileNotFoundException
//	{
//		
//	}
//}
//class Y extends X
//{
//	void test1() throws Exception
//	{
//		
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) 
//	{
//		X obj1=new X();
//		System.out.println("After everything");
//	}
//
//}
//output error heirarchi will decreases here

//case 6
//class X
//{
//	void test1() throws Exception
//	{
//		
//	}
//}
//class Y extends X
//{
//	void test1() throws FileNotFoundException
//	{
//		
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) 
//	{
//		X obj1=new X();
//		
//		System.out.println("After everything");
//	}
//
//}
//valid heirarchi

//case 7  Checked exception
//class X
//{
//	X() throws FileNotFoundException
//	{
//		
//	}
//}
//class Y extends X
//{
//	Y() throws Exception
//	{
//		
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) throws Exception 
//	{
//		X obj1=new X();
//		
//		System.out.println("After everything");
//	}
//}
//output error because if we write throws in base class constructor then it is 
//compulsory to write throws in child class constructor
//But if we write throws in child class constructor then it is not compulsory to 
//write in base class constructor--Rule
//for pure unchecked exception above rule is not applicable

//case 8
//class X
//{
//	X() throws ArithmeticException
//	{
//		
//	}
//}
//class Y extends X
//{
//	Y()  
//	{
//		
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) throws Exception 
//	{
//		X obj1=new X();
//		System.out.println(obj1);
//		System.out.println("After everything");
//	}
//}

//case 9
//class X
//{
//	X() 
//	{
//		
//	}
//}
//class Y extends X
//{
//	Y()  throws ArithmeticException
//	{
//		
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) throws Exception 
//	{
//		X obj1=new X();
//		System.out.println(obj1);
//		System.out.println("After everything");
//	}
//}

//case 10
//class X
//{
//	X() throws ArithmeticException
//	{
//		
//	}
//}
//class Y extends X
//{
//	Y()  throws ArithmeticException
//	{
//		
//	}
//}
//public class Throws 
//{
//
//	public static void main(String[] args) throws Exception 
//	{
//		X obj1=new X();
//		System.out.println(obj1);
//		System.out.println("After everything");
//	}
//}



//class Invalid extends RuntimeException
//{
//	Invalid(String str)
//	{
//		super(str);
//	}
//	
//}
//public class Throws
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Enter the age: "+args[0]);
//		int age=Integer.parseInt(args[0]);
//		if(age<=18)
//		{
//			throw new Invalid("Age is below 18");
//		}
//		System.out.println("After everything");
//
//	}
//}


//Creating Exception
class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}

public class Throws
{
	public static void main(String args[])
	{
		try
		{
			vote(10);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
	public static void vote(int age) throws InvalidAgeException
	{
		if(age<=18)
		{
			throw new InvalidAgeException("Age is below 18");
		}
		else
		{
			System.out.println("Valid age");
		}
	}
}




