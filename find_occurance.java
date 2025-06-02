import java.util.HashMap;
import java.util.Map;

public class find_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="zafar";
		char [] ch=a.toCharArray(); 
		Map<Character, Integer> m1= new HashMap <Character, Integer>();
		
		for( char c: ch)
		{
			if(!m1.containsKey(c))
			{
			m1.put(c, 1);
			}
			else
			{
				int value=m1.get(c);
				m1.put(c, value+1);
			}
		}

		
		System.out.println(m1);
		
		
		

	}

}
