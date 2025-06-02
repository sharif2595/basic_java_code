package java_prorgam_pract;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate {

	public static void main(String[] args) {
		
		String str1="java";
		
		StringBuilder sb= new StringBuilder();
		
		//char [] a= str1.toCharArray();
		
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0; i<=str1.length()-1; i++)
		{
			set.add(str1.charAt(i));
		}
		
		System.out.println(set);
		
		for(Character ch: set)
		{
			sb.append(ch);
		}
		System.out.println(sb);
		
		//reverse the string
		
		char c;
		String rev_word="";
		
		for(int z=0; z<sb.length(); z++) {
			
			c=sb.charAt(z);
			rev_word=c+rev_word;
			
		}
		
		System.out.println(rev_word);
	}

}
