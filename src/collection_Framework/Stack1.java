package collection_Framework;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) 
	{
		Stack<String> obj1=new Stack<String>();
		obj1.push("Welcome");
		obj1.push("Raksha");
		obj1.push("Hello");
		System.out.println(obj1);
		
		obj1.pop();
		System.out.println(obj1);
		
		System.out.println(obj1.pop());
		
		System.out.println(obj1);
		
		System.out.println(obj1.peek());
		
		System.out.println(obj1);
		
		obj1.push("Hello");
		obj1.push("bye");
		System.out.println(obj1);
		
		System.out.println(obj1.peek());
		
	
	}

}
//Output:-
//[Welcome, Raksha, Hello]
//[Welcome, Raksha]
//Raksha
//[Welcome]
//Welcome
//[Welcome]
//[Welcome, Hello, bye]
//bye

