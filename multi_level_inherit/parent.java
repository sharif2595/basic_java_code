package multi_level_inherit;

public class parent extends grand_parent {
	
	static void parent_age()
	{ 
		int age=50;
		System.out.println("parent_age  is " + age);
	}
	
	void parent_color ()
	{ 
		String color="fair";
		System.out.println("parent_color is " + color);
	}

}
