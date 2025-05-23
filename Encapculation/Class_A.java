package Encapculation;

public class Class_A {
	
	
	private String username;
	private int OTP;
	private char gender;
	
	void get_details()
	{
		System.out.println("get details with out using encapsulation");
		System.out.println("username is "+ username );
		System.out.println("OTP is "+ OTP );
		System.out.println("gender is" + gender );
		
	}
	
	void get_details_encap()
	{
		System.out.println("get details using encapsulation");
		System.out.println("username is "+ username );
		System.out.println("OTP is "+ OTP );
		System.out.println("gender is" + gender );
		
	}
	 
	public String getUsername()
	{
		return username;	
	}
	
	public void setUsername(String username)
	{
		this.username=username;
	}
	
	public int getOtp()
	{
	  return OTP;
	}
	
	public void setOtp(int OTP)
	{
		this.OTP=OTP;
	}
	
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

		public static void main(String[] args) {
			
			Class_A cA= new Class_A();
			cA.get_details();
			
		}
	
	
}
