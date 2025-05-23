package partice_java;

public class program {

	public static void main(String[] args) {
		
		String s1="zafar";
		char r;
		String str_rev ="";
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			r=s1.charAt(i);
			str_rev=r+str_rev;
		}
		System.out.println(str_rev);
		
		
		//check duplicate elements in an array
		
		int [] c1= {0,1,1,2,3,4,4,5,5};
		
		for(int i=0; i<=c1.length-1; i++)
		{
			for(int j=i+1; j<=c1.length-1; j++)
			{
				if((c1[i]==c1[j]) && (i!=j))
				{
					System.out.println(c1[i]);
				}
			}
		}
		
		
		
		
		//check string has a dupicate elemets or not 
		
		String str1="zafarshareef";
		
		char[] str_char=str1.toCharArray();
		
			for(int i=0; i<=str_char.length-1; i++)
			{
				for(int j=i+1; j<=str_char.length-1; j++)
				{
					if((str_char[i]==str_char[j])&& (i!=j))
					{
						System.out.println(str_char[i]);
					}
				}
			}

	}

}