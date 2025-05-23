package this_calling_statement;

public class explicty_this_calling_statement_eg {
	
	explicty_this_calling_statement_eg()
	{  
		this(22.5f);
		System.out.println("non parameterized constructor calling using this statement 1");
	}
	
	explicty_this_calling_statement_eg(int a)
	{	
		
		System.out.println("parameterized constructor 2 calling using this statement");
	}
	
	explicty_this_calling_statement_eg(float b)
	{
		this(5);
		System.out.println("non parameterized constructor 3 calling using this statement");
	}
	
	public static void main(String[] args) {
		
		explicty_this_calling_statement_eg c1=new explicty_this_calling_statement_eg();
		
		
	}

}
