package constructor_overload;

public class const_call {
	
	const_call()
	{
		System.out.println("constructor calling form different class");
	}

	public static void main(String[] args) {
		
		new constructor_over_load_different_class();
		new constructor_over_load_different_class(1);
		new constructor_over_load_different_class(34.3f,5);
	}

}
