package AB_54;

public class Parameterized_const {
	
	
	Parameterized_const(String name)
	{
		System.out.println("My name is " + name + " Calling via paramertized constructor");
	}
	
	public void parameterized_name(String abc)
	{
		System.out.println("My name is " + abc + " Calling via paramertized method ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Parameterized_const("zafar");// calling constructor via parameterized constructor 
		Parameterized_const p1=new Parameterized_const("abc");
		p1.parameterized_name("zafar");
		

	}

}
