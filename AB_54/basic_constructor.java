package AB_54;

public class basic_constructor {
	
	basic_constructor()
	{
		System.out.println("Calling the basic contructor class");
	}
	
	public void basic_constructor()
	{
		System.out.println("Calling the basic contructor class 1");
	}
	public static void main(String[] args) {
		
		//new basic_constructor();//   this is used when only construtor is given and no non static method is given 
		basic_constructor bc= new basic_constructor();// this is used when constructor
		bc.basic_constructor();//this is used to call the non static method 
	
	}
	
}
 