package multithreading;

//Case 1
//class Mythread extends Thread
//{
//	public void run()
//	{
//		for (int i=0;i<10;i++)
//		{
//			System.out.println("Child");
//		}
//	}
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		t.start();
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("Parent");
//		}
//	}
//
//}


//Case 2 when we have two run method
//class Mythread extends Thread
//{
//	public void run()
//	{
//		System.out.println("run1");
//	}
//	public void run(int x)
//	{
//		System.out.println("run2");
//	}
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		t.start();
//		System.out.println("Parent");
//	}
//
//}
//Output:-Parent
//run1


//Case 3
//class Mythread extends Thread
//{
//	/*public void run()
//	{
//		//System.out.println("run1");
//	}
//	public void run(int x)
//	{
//		//System.out.println("run2");
//	}*/
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		t.start();
//		System.out.println("Parent");
//	}
//
//}
//Output:-Parent


//Case 4
//class Mythread extends Thread
//{
//	public void run()
//	{
//		System.out.println("run1");
//	}
//	public void start()
//	{
//		System.out.println("party");
//	}
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		t.start();
//		System.out.println("Parent");
//	}
//
//}
//Output:-party
//Parent


//Case 5
//class Mythread extends Thread
//{
//	public void run()
//	{
//		System.out.println("run1");
//	}
//	public void start()
//	{
//		super.start();
//		System.out.println("Start");
//	}
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		t.start();
//		System.out.println("Main wali class");
//	}
//
//}
//Output:-Start
//Main wali class
//run1


//Case 6 Runnable
//class Mythread implements Runnable
//{
//	public void run()
//	{
//		System.out.println("Child");
//	}
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		Thread obj=new Thread(t);
//		obj.start();
//		System.out.println("Main wali class");
//	}
//
//}
//Output:-Main wali class
//Child


//class Mythread implements Runnable
//{
//	public void run()
//	{
//		System.out.println("Child");
//	}
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		Thread obj=new Thread();
//		obj.start();
//		System.out.println("Main wali class");
//	}
//}
//Output:-Main wali class


//class Mythread implements Runnable
//{
//	/*public void run()
//	{
//		System.out.println("Child");
//	}*/
//}
//public class Multhreading1 {
//
//	public static void main(String[] args) 
//	{
//		Mythread t=new Mythread();
//		Thread obj=new Thread(t);
//		obj.start();
//		System.out.println("Main wali class");
//	}
//}
//Output:-error

