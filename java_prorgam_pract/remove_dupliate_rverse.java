package java_prorgam_pract;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_dupliate_rverse {

	public static void main(String[] args) {
		
		
		
		String str1="zafar shareef";
		
		StringBuilder sb= new StringBuilder();
		
		Set<Character> set =new LinkedHashSet<Character>();
		
		for(int i=0; i<=str1.length()-1; i++)
		{
			set.add(str1.charAt(i));
		}
		System.out.println(set);
		
		
		for( Character c1: set)
		{
			sb.append(c1);
		}
		
		System.out.println(sb);
	
		
		//print length without using in build function 
		String x="zafar shareef";
		int len=0;
		
		for(char c1:x.toCharArray())
		{
			len++;		
	    }
		System.out.println(len);	
		
		// occrance of each character in a string
		
	 String v="mom";
	 
	 int total_len=v.length();
      int  total_len_replace =v.replace("g", "").length();
	 
	 int total_count = total_len- total_len_replace;
	 
	 System.out.println("The count of a is" +total_count);
	 
	 
}
		}
