package AB_54;

public class this_statement {
	
	this_statement()
	{
		this(5.6f);
		System.out.println("Constructor 1 of same class" );
	}
	
	this_statement(int a)
	{
		
		System.out.println("Constructor 2 of same class" );
	}
	
	
	this_statement(float a)
	{
		this(3);
		System.out.println("Constructor 3 of same class" );
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		new this_statement();
	}

}
