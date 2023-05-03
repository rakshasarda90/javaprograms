package multithreading;

//Case 1
//class Mythread extends Thread
//{
//	public void run()
//	{
//		System.out.println("Child running");
//	}
//}
//public class ThreadConstructor {
//
//	public static void main(String[] args) 
//	{	
//		Mythread t =new Mythread();
//		System.out.println(t.getName());
//		t.setName("child");
//		System.out.println(t.getName());
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("Bahubali");
//		System.out.println(Thread.currentThread().getName());
//		t.start();
//		System.out.println("main wali class");
//	}
//
//}
//Output:-Thread-0
//child
//main
//Bahubali
//main wali class
//Child running

//********************************************************************************
//Case 2 Thread Priorities
//class Mythread extends Thread
//{
//	public void run()
//	{
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println("Child running");
//	}
//}
//public class ThreadConstructor {
//
//	public static void main(String[] args) 
//	{	
//		Mythread t =new Mythread();
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(10);
//		System.out.println(Thread.currentThread().getPriority());
//		t.start();
//		
//	}
//
//}
//Output:-5
//10
//5
//Child running


//class Mythread extends Thread
//{
//	public void run()
//	{
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println("Child running");
//	}
//}
//public class ThreadConstructor {
//
//	public static void main(String[] args) 
//	{	
//		Mythread t =new Mythread();
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(17);
//		System.out.println(Thread.currentThread().getPriority());
//		t.start();
//		
//	}
//
//}
//Output:-5
//java.lang.IllegalArgumentException

//***********************************************************************************
//Case 3
//class Mythread extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=20;i++)
//		{
//			System.out.println("Child running");
//	
//		}
//	}
//}
//public class ThreadConstructor {
//
//	public static void main(String[] args) 
//	{	
//		Mythread t =new Mythread();
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(10);
//		t.start();
//		for(int i=1;i<=20;i++)
//		{
//			System.out.println("main wali class");
//		}
//	}
//
//}
//Output:- main wali class --> 20 times
//child running --> 20 times


