import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		String a="i love programming";
		StringBuilder sb= new StringBuilder();
		Set<Character> s1= new LinkedHashSet<Character>();
		
		for(int i=0; i<=a.length()-1; i++)
		{
			s1.add(a.charAt(i));
			
		}
		System.out.println(s1);
		
		for(Character ch: s1)
		{
			System.out.println(ch);
			sb.append(ch);
		}
		System.out.println(sb);
		
		
		String s=sb.toString();
		
		System.out.println(s);
		
		System.out.println(s.replaceAll("\\s{2,}", "").trim());
		
	}

}
