package partice_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class covert_array_to_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Length");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		
		ArrayList<String> arr1=new ArrayList<String>();
		System.out.println("Enter value for len");
		for(int i=0; i<=len; i++)
		{
		 arr1.add(sc.next());
		}
	          
	    System.out.println("Array 1 input--->"+ arr1.toString());
	    
	    System.out.println("Enter Length");
		Scanner sc1=new Scanner(System.in);
		int lent=sc.nextInt();
		
		ArrayList<String> arr2=new ArrayList<String>();
		System.out.println("Enter value for len");
		for(int i=0; i<=lent; i++)
		{
		 arr2.add(sc1.next());
		}
	          
	    System.out.println("Array two input--->"+arr2.toString());
	    
	    
	    //covert array list to
	    arr1.addAll(arr2);
	    
	    System.out.println("combining 1 +2 final array -->"+arr1.toString());
	    

	}

}
