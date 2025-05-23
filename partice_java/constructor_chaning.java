package partice_java;

public class constructor_chaning {
	
	
	constructor_chaning()
	{
		this(5.6f);
		System.out.println("Calling constructor 1");
	}
	constructor_chaning(int a)
	{
		System.out.println("Calling constructor 2");
	}
	constructor_chaning(float b)
	{	this(5);
		System.out.println("Calling constructor 3");
	}

	public static void main(String[] args) {
		
		new constructor_chaning();
		
	}
}