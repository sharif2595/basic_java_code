package AB_54;


class one
{
	void login()
	{
		System.out.println("login via a mobile OTP");
	}
	
}


class two extends one
{
	void login()
	{
		//super.login();
		System.out.println("login via a google account");
		
	}
	
}

public class method_overidde extends two{

	public static void main(String[] args) {
		
		method_overidde m1=new method_overidde();
		m1.login();
		
}
}
