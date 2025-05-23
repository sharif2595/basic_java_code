package partice_java;


class grandparent{
	
	grandparent(int a)
	{  
		
		System.out.println("calling constructor of grand parent class with super calling statement");
		
	}
}


class parent extends grandparent
{
	parent()
	{
		super(5);
		System.out.println("calling constructor of parent class with super calling statement");
	}
}


class child extends parent
{
	child(float b)
	{
		super();
		System.out.println("calling constructor of child class with super calling statement");
	}
}

public class super_key extends  child {
	

	super_key()
	{
		super(6.5f);
		System.out.println("calling constructor of super child  class with super calling statement");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new super_key();

	}

}
