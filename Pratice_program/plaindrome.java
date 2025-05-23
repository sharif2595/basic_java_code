package Pratice_program;

public class plaindrome {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String z="mom";
		 String s2="";
		 char r;
		
		for(int i=0; i<z.length(); i++)
		{
			//System.out.println(z.charAt(i));
			r=z.charAt(i);
			s2=r+s2;
			System.out.println(s2);
		}
		
		if(z.equals(s2))
		{
			System.out.println("String is plaindrome");
		}
		else
		{
			System.out.println("String is not plaimdrome");
		}
	}

}
