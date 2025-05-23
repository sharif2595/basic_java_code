package AB_54;


public class child_ab {
	
	
	child_ab()
	{
		System.out.println("Constructor 1 of class child_ab");
	}
	
	child_ab(int a)
	{
		System.out.println("Constructor 2 of class child_ab");
	}
	
	child_ab(float b)
	{
		System.out.println("Constructor 3 of class child_ab");
	}
	
	child_ab(int a, float b)
	{
		
		System.out.println("Constructor 4 of class child_ab");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new child_ab();
		new child_ab(5);
		new child_ab(4.5f);
		new child_ab(5,4.5f);
	}

}
