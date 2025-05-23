package supercalling_statement;


class one
{
	one()
	{
		System.out.println("Implicity calling one class constructor");
	}	
	
}

class two extends one 
{
	two()
	{
		System.out.println("Implicity calling two class constructor");
	}	
	
}

public class Implicity_super_calling_eg extends two  {
	
	Implicity_super_calling_eg()
	{
		System.out.println("Implicity calling child class constructor");
	}
	
	public static void main(String[] args) {
		
		Implicity_super_calling_eg imp1= new Implicity_super_calling_eg();
	}


}
