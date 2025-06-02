package java_prorgam_pract;

public class len {

	public static void main(String[] args) {
	
		
		String s1="HELLO PEOPLE";
		int lent=0;
		for(int i=0;i<s1.length();i++)
		{
			lent++;
		}
		System.out.print(lent);
		
		
		
		
		
		//occrance of particular character
		
		String inp="java programming";
		int count=0;
		int total_s_length =   inp.length();
	
		int total_s_lenght_without_a=inp.replace("a", "").length();
		
		count=total_s_length-total_s_lenght_without_a;
		
		System.out.println("Count of a is :" + count);
				
		
	}

}
