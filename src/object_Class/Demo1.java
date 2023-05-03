package object_Class;
//class Student
//{
//	int id;
//	String name;
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Student obj1=new Student();
//		System.out.println(obj1);
//
//	}
//
//}


//case 2
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	public String toString()
//	{
//		return id+":"+name;
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Person p=new Person(101,"albert");
//		String str="welcome "+p;
//		System.out.println(p);
//		System.out.println(str);
//	}
//}
//output 101:albert
//welcome 101:albert


//case 3
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	Person()
//	{
//		
//	}
//	public String toString()
//	{
//		return id+":"+name;
//	}
//}
//class Student extends Person
//{
//	
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Student p=new Student();
//		
//		System.out.println(p);
//		
//	}
//}
//output 0:null


//case 4
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	Person()
//	{
//		
//	}
//}
//class Student extends Person
//{
//	int pmoney;
//	Student(int pmoney)
//	{
//		super(101,"albert");
//		this.pmoney=pmoney;
//	}
//	public String toString()
//	{
//		return id+":"+name+":"+pmoney;
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Student p=new Student(5000);
//		System.out.println(p);
//	}
//}
//output  101:albert:5000

//case 5
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//	}
//	
//}
//class Student extends Person
//{
//	int pmoney;
//	Student(int pmoney)
//	{
//		super(101,"albert");
//		this.pmoney=pmoney;
//	}
//	public String toString()
//	{
//		return id+":"+name+":"+pmoney;
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Student p=new Student(5000);
//		System.out.println(p);
//	}
//}
//output 0:null:5000

//case 6
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	
//}
////class Student extends Person
////{
////	int pmoney;
////	Student(int pmoney)
////	{
////		super(101,"albert");
////		this.pmoney=pmoney;
////	}
////	public String toString()
////	{
////		return id+":"+name+":"+pmoney;
////	}
////}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Person p1=new Person(101,"abc");
//		Person p2=new Person(101,"abc");
//		int i=100;
//		int j=100;
//		System.out.println(p1==p2);
//		System.out.println(i==j);
//	}
//}
//output
//false
//true

//case 7
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	
//}
//
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Person p1=new Person(101,"abc");
//		Person p2=new Person(101,"abc");
//		int i=100;
//		int j=100;
//		System.out.println(p1==p2);
//		System.out.println(i==j);
//		Person p3=p2;
//		System.out.println(p3==p2);
//		System.out.println(p1.equals(p2));//equals method also check address of p1 and p2 is different that's why false
//	}
//}
//output
//false
//true
//true
//false

//case 8
//class Person
//{
//	int id;
//	String name;
//	Person(int id,String name)
//	{
//		this.id=id;
//		this.name=name;
//	}
//	public String toString()
//	{
//		return id+":"+name;
//	}
//	public boolean equals(Person p)
//	{
//		Person p5=p;
//		//return this.id==p.id && this.name.equals(p.name);
//		return this.id==p5.id && this.name.equals(p5.name);
//	}
//}
//
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Person p1=new Person(101,"abc");
//		Person p2=new Person(101,"abc");
//		int i=100;
//		int j=100;
//		System.out.println(p1==p2);
//		System.out.println(i==j);
//		Person p3=p2;
//		System.out.println(p3==p2);
//		System.out.println(p1.equals(p2));//equals method also check address of p1 and p2 is different that's why false
//	}
//}
//output
//false
//true
//true
//true

