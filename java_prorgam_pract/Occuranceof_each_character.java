package java_prorgam_pract;

import java.util.HashMap;
import java.util.Map;

public class Occuranceof_each_character {

	public static void main(String[] args) {
		
		String s="programming";
		char[] a=s.toCharArray();
		
		Map<Character, Integer> map1=new HashMap<Character, Integer>();
		
		for(char ch: a)
		{
			if(!map1.containsKey(ch))
			{
				map1.put(ch, 1);
			}
			else
			{
				int count=map1.get(ch);
				map1.put(ch, count+1);
			}
			
			System.out.println(map1);
		}
		
		

	}

}
