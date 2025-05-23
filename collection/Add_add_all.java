package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Add_add_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		System.out.println("Enter the number for hou  many data set do you want to enter");
		
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.println("Enter the String");
		List <String> c1= new ArrayList <String> ();
		for(int i=0; i<=count; i++)
		{
			c1.add(sc.next());
		}
		
		System.out.println(c1);
		
		
		Iterator<String> i1=c1.iterator();
		
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
		
		
		System.out.println("List iterator method");
		ListIterator<String> l3=c1.listIterator();
		
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}
		
		System.out.println("Previous iterator");
		while(l3.hasPrevious())
		{
			System.out.println(l3.previous());
		}
		
		 
	/*	List <String> c1= new ArrayList <String> ();
		c1.add("zafar");
		c1.add("rahul");
		c1.add("Manish");
		c1.add("JWS");
		
		System.out.println(c1);
		
		List c2= new ArrayList();
		c2.add(0);
		c2.add(1);
		c2.add(2);
		c2.add(3);
		
		System.out.println(c2);
		
	// c2.addAll(0, c1);
	 
	// System.out.println(c2);
	
	 c2.addAll(1, c1);
	 System.out.println(c2); */
		
	}
	
	
	
	

}
