package AB_54;

public class new_class {
	
	int a =500;
	int b=200;
	
	void sum()
	{
		new_class l1= new new_class();
		l1.a=300;
		l1.b=40;
		System.out.println(l1.a);
		System.out.println(l1.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new_class l1= new new_class();
		System.out.println(l1.a);
		System.out.println(l1.b);
		
		new_class add= new new_class();
		add.sum();
		

	}

}
