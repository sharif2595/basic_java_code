package AB_54;

public class Contructor_overload {
	
	
	Contructor_overload(float height)
	{
		System.out.println("The height is " + height);
	}

	Contructor_overload(int age)
	{
		System.out.println("age is " + age);
	}
	
	Contructor_overload(String name)
	{
		System.out.println("name is" +  name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Contructor_overload("Zafar");
		new Contructor_overload(6.1f);
		new Contructor_overload(30);
		
		
		Contructor_overload	c1=new Contructor_overload("Zafar");
		Contructor_overload c2=new Contructor_overload(6.2f);
		Contructor_overload c3=new Contructor_overload(29);
		
		
	}

}
