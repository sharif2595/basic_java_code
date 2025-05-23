package method_overriden;

class steup
{
	void login()
	{
		System.out.println("Mobile_ OTP_login");
	}
	}

public class login extends steup {
	
	void login()
	{
		super.login();
		System.out.println("Mobile userid and password login");
	}

	public static void main(String[] args) {
		
		login l1=new login();
		l1.login();

	}

}
