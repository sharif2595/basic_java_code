package partice_java;


class one
{
	void login()
	{
		System.out.println("login from mobile OTP");
	}
}



public class method_override  extends one {
	
	
	void login()
	{
		super.login();
		System.out.println("login from user if and password");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_override m2=new method_override();
		m2.login();
	}

}
