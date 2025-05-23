package partice_java;


class A
{
	
		A(int f)
		{  
			System.out.println("implity calling construtor 1");
		}
	
	}


class B extends A
{
	
		B(double g)
		{	super(5);
			System.out.println("implity calling construtor 2");
		}
	
	}


public class implcity_contructor extends B {
	
	
	implcity_contructor(float b)
	{	
		super(3455.546);
		System.out.println("implity calling construtor 3");
	}
	
	public static void main(String[] args) {
		
		new implcity_contructor(5.7f);
	}

}
