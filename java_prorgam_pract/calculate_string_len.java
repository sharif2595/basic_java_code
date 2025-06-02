package java_prorgam_pract;

public class calculate_string_len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="zafar shareef";
		int count=0;
		
		char[] a=str1.toCharArray();
		
		for(int i=0; i<=a.length-1; i++)
		{
			count++;
		}
		
		System.out.println("The total lenght is " + count);

	}

}
