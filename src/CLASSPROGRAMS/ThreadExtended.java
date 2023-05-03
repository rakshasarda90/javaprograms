package CLASSPROGRAMS;
//
//public class ThreadExtended extends Thread 
//{
//	public void run()
//	{
//		System.out.println("\nThread is running now\n");
//	}
//	public static void main(String[] args) 
//	{
//		ThreadExtended threadE=new ThreadExtended();
//		threadE.start();
//	
//	}
//
//}



interface A{
	
}
class C{
	
}
class D extends C{
	
}
class B extends D implements A{
	
}
public class ThreadExtended extends Thread 
{
	
	public static void main(String[] args) 
	{
		B b= new B();
		if(b instanceof A)
		{
			System.out.println("b instance of a");
		}
		if(b instanceof C)
		{
			System.out.println("b instance of c");
		}
	}

}
