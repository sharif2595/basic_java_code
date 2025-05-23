package partice_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sysnc {

	public static void main(String[] args) {
		
		System.out.println("Enter the length for the array to input ");
		
		List<String> l1=new ArrayList<String>();
		
		List syn_list= Collections.synchronizedList(l1);
		
		
		System.out.println("Enter the values for the syn list ");
		Scanner sc= new Scanner(System.in);
		int len= sc.nextInt();
		
		for(int i=0; i<=len; i++)
		{
			syn_list.add(sc.next());
		}
		
		System.out.println("syn list output--->" + syn_list);
	}

}
