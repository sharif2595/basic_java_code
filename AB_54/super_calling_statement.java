package AB_54;


class grandparent{
	
	grandparent(int a)
	{ 
		System.out.println("consturctor calling of grandparent class");
	}
	
}

class guardian extends grandparent {
	
	guardian()
	{ 
		super(5);
		System.out.println("consturctor calling of guardian class");
	}
	
}

class child extends parents {
	
	child(String name)
	{	
		super();
		System.out.println("consturctor calling of child class child name is " + name);
	}
	
}

//super calling statement is used in java is used to call parent class constructor from child class constructor 

public class super_calling_statement extends child  {
	
	
	super_calling_statement(char a)
	{
		super("Zafar");
		System.out.println("Constructor calling from super_calling_statement");
	}
	
	public static void main(String[] args) {

		new super_calling_statement('A');
	}

}
