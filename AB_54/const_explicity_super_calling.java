package AB_54;



class parent{
	
	parent(float a, float b)
	{
		System.out.println("Constructor1");
	}
}


class parent2 extends parent{
	
	parent2(int a,int b)
	{    
	    super(10, 20);
		System.out.println("Constructor2 ");
	}
}

class parent3 extends parent2{
	
	parent3()
	{    
	    super(10,20);
		System.out.println("Constructor3 ");
	}
}
public class const_explicity_super_calling extends parent2 {

	const_explicity_super_calling()
	{
		super(10,20);
		System.out.println("Constructor4 ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To explicity call the parameterized  constructor we have to used the keyword super with parameter
		const_explicity_super_calling c1=new const_explicity_super_calling();
	}

}
