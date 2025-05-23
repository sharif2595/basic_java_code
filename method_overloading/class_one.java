package method_overloading;

public class class_one {
	
	static void add(int a)
	{
		System.out.println(" intger Addition");
	}
	
	static void add(float a)
	{
		System.out.println(" float Addition");
	}

	void add(double a)
	{
		System.out.println(" Double Addition");
	}
	
	public static void main(String[] args) {
		
		method_overload_different_class c2=new method_overload_different_class();
		c2.add();
	}

}
