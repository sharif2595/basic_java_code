package partice_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array_to_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Length");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		
		String [] arr1=new String[len];
		System.out.println("Enter value for len");
		for(int i=0; i<=len-1; i++)
		{
			arr1[i]=sc.next();
		}
		
		System.out.println("Array output----->"+ Arrays.toString(arr1));
		System.out.println("Covert array to as list method ----->");
		List<String> l1=  Arrays.asList(arr1);
		
		System.out.println("List--->" + l1);
		
		
	}

}