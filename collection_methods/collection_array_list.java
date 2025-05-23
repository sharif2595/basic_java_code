package collection_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collection_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//methods of collections class 
		
	List<String>a1=new ArrayList<String>(Arrays.asList("Zafar,jws,mkt"));
	System.out.println(a1);
	
	//synchroized list 
	
	List<String>a2=new ArrayList<String>();
	List<String>syn_list=Collections.synchronizedList(a2);
	syn_list.add("fox");
	syn_list.add("whale");
	System.out.println(syn_list);
		
	
	List<Integer>a3=new ArrayList<Integer>();
	a3.add(1);
	a3.add(6);
	a3.add(5);
	a3.add(4);
	a3.add(2);
	a3.add(1);
	System.out.println(a3);
	Collections.sort(a3);
	System.out.println("Sorted list"+a3);
	
	List<Integer>a4=new ArrayList<Integer>();
	a4.add(1);
	a4.add(6);
	a4.add(5);
	a4.add(4);
	a4.add(2);
	a4.add(1);
	

	
	
	
	

	}

}
