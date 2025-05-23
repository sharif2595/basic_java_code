package single_level_inhert;


class parent 
{
	static void parent_age()
	{ 
		int age=50;
		System.out.println("Parent age is " + age);
	}
	
	void parent_color()
	{ 
		String color="Brown";
		System.out.println("Parent color is " + color);
	}
	
}

public class child extends parent {
	
	static void child_age()
	{ 
		int age=25;
		System.out.println("child age is " + age);
	}
	
	void child_color()
	{ 
		String color="Fair";
		System.out.println("child color is " + color);
	}
	

	public static void main(String[] args) {
		
		//calling child class method direclty
		child_age();
		child c1=new child();
		c1.child_color();
		
		//calling parent class method 
		parent_age();
		c1.parent_color();

	}

}
