package serialization_Deserialization;
import java.io.*;


//Case 1 Serialization
//class JCB implements Serializable
//{
//	int i=10;
//	int j=20; 
//	
//}
//public class SerDeserDemo {
//
//	public static void main(String[] args) throws IOException 
//	{
//		JCB obj1=new JCB();
//		FileOutputStream fout= new FileOutputStream("Raksha.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fout);
//		oos.writeObject(obj1);
//		System.out.println("done");
//	}
//
//}
//done

//Case 2 Deserialization
//class JCB implements Serializable
//{
//	int i=10;
//	int j=20; 
//	
//}
//public class SerDeserDemo {
//
//	public static void main(String[] args) throws IOException, ClassNotFoundException 
//	{
//		JCB obj1=new JCB();
//		FileOutputStream fout= new FileOutputStream("Raksha.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fout);
//		oos.writeObject(obj1);
//		
//		FileInputStream fin=new FileInputStream("Raksha.ser");
//		ObjectInputStream ois=new ObjectInputStream(fin);
//		JCB obj2=(JCB)ois.readObject();
//		System.out.println(obj2.i);
//		System.out.println(obj2.j);
//		System.out.println("done");
//	}
//}
//10
//20
//done



//Case 3 Transient Keyword
//class JCB implements Serializable
//{
//	int i=10;
//	transient int j=20; 
//	
//}
//public class SerDeserDemo {
//
//	public static void main(String[] args) throws IOException, ClassNotFoundException 
//	{
//		JCB obj1=new JCB();
//		FileOutputStream fout= new FileOutputStream("Raksha.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fout);
//		oos.writeObject(obj1);
//		
//		FileInputStream fin=new FileInputStream("Raksha.ser");
//		ObjectInputStream ois=new ObjectInputStream(fin);
//		JCB obj2=(JCB)ois.readObject();
//		System.out.println(obj2.i);
//		System.out.println(obj2.j);
//		System.out.println("done");
//	}
//}
//10
//0
//done

