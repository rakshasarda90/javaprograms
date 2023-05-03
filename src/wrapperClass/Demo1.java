package wrapperClass;

public class Demo1 
{

	public static void main(String[] args) 
	{
		int i=10;
		Integer obj=i;
		Integer obj2=new Integer(100);
		int x=obj2;
		System.out.println(x);
		System.out.println(obj);
		System.out.println(i);
	}

}
//output
//100
//10
//10

