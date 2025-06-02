package java_prorgam_pract;

public class plaindrome {

	public static void main(String[] args) {
	
		String s1="mom";
		char a = 0;
		String rev_word = "";
		
	for(int i=0; i<=s1.length()-1; i++)
	{
		a=s1.charAt(i);
		rev_word=a +rev_word;
		
	}
;
	
	System.out.println(rev_word);
	
	if(s1.equals(rev_word))
	{
		System.out.println("String is plaindrome");
	}
	else
	{
		System.out.println("String is not plaindrome");
	}
	
	}
	
	
	

}
