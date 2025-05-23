package AB_54;

abstract class zero
{
	abstract void login();
	abstract void registration();
	void setup()
	{	
		
		System.out.println("calling setup method from abstract class");
		
	}
}

public class abs  extends zero {
	
	void calucation()
	{
		System.out.println("Calling calucation class from the child class");
	}
	
	void login()
	{
		System.out.println("Calling  implementation of login  method of abstract class from the child class");
	}

	void registration()
	{
		System.out.println("Calling  implementation of registration method of abstract class from the child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs a=new abs();
		a.setup();
		a.calucation();
		a.login();
		a.registration();
	}

	

}
