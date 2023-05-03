package multithreading;

//Case 1 yield()
//class Mythread extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("run1");
//			Thread.yield();
//		}
//	}
//}
//public class ThreadExecution {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		t.start();
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("main wali class");
//		}
//		
//	}
//
//}

//**************************************************************************
//Case 2 join()
//class Mythread extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("run1");
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException ee)
//			{
//				System.out.println("Interrupted");
//			}
//		}
//	}
//}
//public class ThreadExecution {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Mythread t=new Mythread();
//		t.start();
//		t.join();
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("main wali class");
//		}
//	}
//}
//Output:-run1 execution will complete first after main class will be run


//class Mythread extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("run1");
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException ee)
//			{
//				System.out.println("Interrupted");
//			}
//		}
//	}
//}
//public class ThreadExecution {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Mythread t=new Mythread();
//		t.start();
//		t.join(2000);
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("main wali class");
//		}
//	}
//}
//Output:-main class will stop their execution for given time, if in given time child class 
//execution will be completed then main class will be run if chile class is not completed then
//after given time main class will be run and after that child will execute

//***********************************************************************************
//Case 3 sleep()
//class Mythread extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("run1");
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException ee)
//			{
//				System.out.println("Interrupted");
//			}
//		}
//	}
//}
//public class ThreadExecution {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Mythread t=new Mythread();
//		t.start();
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("main wali class");
//		}
//	}
//}

//**********************************************************************************
//Case 4 Interrupt by another thread
//class Mythread extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("Hey guys");
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException ee)
//			{
//				System.out.println("Train aagai");
//			}
//		}
//	}
//}
//public class ThreadExecution {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Mythread t=new Mythread();
//		t.start();
//		t.interrupt();
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("Done");
//		}
//	}
//}

//**************************************************************************************
//Case 5 Synchronized Keyword
//class Display
//{
//	public synchronized void m1(String name)
//	{
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("hey guys");
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException ee)
//			{
//				
//			}
//			System.out.println(name);
//		}
//	}
//}
//class Mythread extends Thread
//{
//	Display d;
//	String name;
//	Mythread(Display d,String name)
//	{
//		this.d=d;
//		this.name=name;
//	}
//	public void run()
//	{
//		d.m1(name);
//	}
//}
//public class ThreadExecution {
//
//	public static void main(String[] args) throws InterruptedException
//	{
//		Display d1=new Display();
//		Mythread t1=new Mythread(d1,"Raksha");
//		Mythread t2=new Mythread(d1,"Mrunal");
//		t1.start();
//		t2.start();
//		
//	}
//}
//Output:- which ever thread is goes for first execution then it will lock that thread and 
//execute that thread fully and then lock will release and after that 2nd thread execute
