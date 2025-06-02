package java_prorgam_pract;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class occurance_char {

	public static void main(String[] args) {
	
		String sc="zafar";
		
		char [] ch =sc.toCharArray();
		
		Map<Character, Integer> map1=new HashMap<Character, Integer>();
		
		for(char c:ch)
		{
			if(!map1.containsKey(c))
			{
			map1.put(c, 1);
			}
			else
			{
				int value=map1.get(c);
				map1.put(c, value+1);
				
			}
			
			System.out.println(map1);
		}
		
	}

}
