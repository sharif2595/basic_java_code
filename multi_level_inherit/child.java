package multi_level_inherit;

public class child extends parent{
	
	static void child_age()
	{ 
		int age=20;
		System.out.println("child age  is " + age);
	}
	
	void child_color ()
	{ 
		String color="white";
		System.out.println("child color is " + color);
	}

	
 public static void main(String[] args) {
	
	 //calling child class method 
	 child_age();
	 child c1=new child();
	 c1.child_color();
	
	 
	 //calling parent class method 
	 parent_age();
	 c1.parent_color();
	 
	 //calling grandparent class 
	 grand_parent_age();
	 c1.grand_parent_color();
}
}
