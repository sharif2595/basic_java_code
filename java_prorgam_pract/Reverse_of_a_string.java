package java_prorgam_pract;

public class Reverse_of_a_string {

	public static void main(String[] args) {
	
		String s="Java";
		int count_len=s.length();
		
		char a;
		String reverse_wor="";
		
		for(int i=count_len-1; i>=0; i--)
		{
			a=s.charAt(i);
			reverse_wor=reverse_wor + a;
		}
		System.out.println(reverse_wor);

	}

}
