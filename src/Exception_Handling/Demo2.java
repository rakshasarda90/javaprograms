package Exception_Handling;
//class A1
//{
//	
//	int test()
//	 {
//		 try
//		{
//			String str=null;
//			int x=str.length();
//			System.out.println(x);
//			
//		}
//		catch(ArrayIndexOutOfBoundsException uu)
//		{
//			
//		}
//		catch(Exception ss)
//		{
//			System. exit(0);
//		}
//		finally
//		{
//			System.out.println("Party");
//			return 500; 
//		}
//		
//	 }
//}
//public class Demo2  
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A1 obj1=new A1();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome

//case 2
//class A1
//{
//	int test()
//	 {
//		try
//		{
//			int z=10/0; //java.lang.ArithmeticException: / by zero
//			String str=null;//java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
//			int x=str.length();
//			System.out.println(x);
//		}
//		catch(Exception ss)
//		{
//			//System.out.println(ss);
//			ss.printStackTrace();
//			//System.out.println(ss.printStackTrace()); //error 
//			//because its return type is void which will not return anything
//			System.out.println(ss.getMessage());
//		}
//		return 0;
//	 }
//}
//public class Demo2  
//{
//
//	public static void main(String[] args) 
//	{
//		System.out.println("Welcome");
//		A1 obj1=new A1();
//		System.out.println(obj1.test());
//	}
//}
//output
//Welcome
//java.lang.ArithmeticException: / by zero
//0

//case 3
public class Demo2  
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		try
		{
			
			String s=args[0];
			int z=10/0; 
			String str=null;
			int x=str.length();
			System.out.println(x);
		}
		catch(Exception ss)
		{
			{
				System.out.println(ss.getMessage());
			}
		}
	}
}
//output
//Welcome
//Index 0 out of bounds for length 0
//Welcome
// by zero
//Welcome
//Cannot invoke "String.length()" because "str" is null
