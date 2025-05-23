package method_overloading;

public class over_load {
	
	
	static void name()
	{
		System.out.println("Family name is shareef");
	}
	
	void name(String name)
	{
		System.out.println("Family name is " + name);
	}

	public static void main(String[] args) {
		
		
		//method over load in same class
		name();
		over_load ov1=new over_load();
		ov1.name("khan");

	}

}
