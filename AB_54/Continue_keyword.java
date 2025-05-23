package AB_54;

public class Continue_keyword {
	

	public  static void number_not_divisible()
	{
		for(int i=1; i<=20; i++)
			if(i%2==0)
			{
				continue;
			}
			else
			{
			  System.out.println(i);	
			}
	}
	
	//Use continue to print all numbers from 1 to 20 that are not divisible by 3.
	
	
	public static void main(String[] args) {
		
		
		number_not_divisible();
		
		/*for(int i=1; i<=10; i++)
			
		{
			if(i%2==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		
	}*/
}
}
