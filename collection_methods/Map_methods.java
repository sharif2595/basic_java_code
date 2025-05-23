package collection_methods;

import java.awt.Scrollbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Map<Integer, String> a1=new HashMap<Integer, String>();
		//put is used to add the data in map collection
		a1.put(1, "C++");
		a1.put(2, "C");
		a1.put(3, "java");
		a1.put(4, "python");
		
		System.out.println(a1);
		
		
		//putall is used add all map value from 1 map tp another map
		Map<Integer, String> a2=new HashMap<Integer, String>();
		//put is used to add the data in map collection
		a2.put(5, "java script");
		a2.put(6, "ruby");
		a2.put(7, "R");
		a2.put(8, "python --");
		
		a1.putAll(a2);
		boolean b=a1.containsKey(7);
		System.out.println("Contains values of "+b);
		
		System.out.println(a1);
		
		boolean ans=a1.isEmpty();
		System.out.println(ans); */
		
		System.out.println("lenght  of map");
		Scanner sc= new Scanner(System.in);
		int count=sc.nextInt();
		
		System.out.println("Enter the values in key pair form");
		Map<Integer, String> a3=new HashMap<Integer, String>();
		
		for(int i=1; i<=count; i++)
		{
		a3.put(sc.nextInt(), sc.next());
		System.out.print(a3);
		}
		System.out.println(a3);
		
		System.out.println("contains key or not");
		System.out.println("search for the key input key number ");
		Scanner sc1= new Scanner(System.in);
		int num_key=sc.nextInt();
		for(int i=1; i<=count; i++)
		{
			if(a3.containsKey(num_key))
			{
				System.out.println(a3.get(num_key));
			}
		}
		
	}
}

