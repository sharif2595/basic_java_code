package Encapculation;

public class Class_B {

	public static void main(String[] args) {
		
	Class_A b1=new Class_A();
	b1.get_details();
	b1.setUsername("zafarshareef");
	b1.getUsername();
	b1.setOtp(70896);
	b1.getOtp();
	b1.setGender('M');
	b1.getGender();
	
	b1.get_details_encap();
	
		

	}

}
