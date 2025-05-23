package constructor_overload;

public class constructor_over_load_same_class {
	
	constructor_over_load_same_class()
	{
		System.out.println("first call constructor");
	}
	
	constructor_over_load_same_class(int a)
	{
		System.out.println("second call constructor");
	}
	

	constructor_over_load_same_class(float a, int b)
	{
		System.out.println("third call constructor");
	}

	public static void main(String[] args) {
		
		constructor_over_load_same_class con=new constructor_over_load_same_class();
		constructor_over_load_same_class con2=new constructor_over_load_same_class(2);
		constructor_over_load_same_class con3=new constructor_over_load_same_class(43.4f,3);
	}

}
