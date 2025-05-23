package constructor_overload;

public class constructor_over_load_different_class {
	
	constructor_over_load_different_class()
	{
		System.out.println("first call constructor");
	}
	
	constructor_over_load_different_class(int a)
	{
		System.out.println("second call constructor");
	}
	

	constructor_over_load_different_class(float a, int b)
	{
		System.out.println("third call constructor");
	}
	
	public static void main(String[] args) {
		
		new const_call();
	}



}
