package Abstract_classes;

import java.awt.DisplayMode;

abstract class bank_inseret_rate {  
	
	bank_inseret_rate()
	{
		this(4);
		System.out.println("Constructor of abstract class");
	}
	
	public void compund_interest() {
		// TODO Auto-generated method stub
		
	}

	bank_inseret_rate(int a)
	{	
		
		System.out.println("Constructor of abstract class");
	}
	
	
	final void compound_interest()
	{
		System.out.println("Compound  intereset of bank is 10.5%");
	}
	
	
    public abstract void insert_rate();  
    
    
     static void display() {  
        System.out.println("Displaying interest rate");  
    }  
}  

public class realtion_between_abs_concerte extends bank_inseret_rate {
	
	@Override
	public void insert_rate() {
		System.out.println("The insert rate of SBI is 8.15%");
	}

	public static void main(String[] args) {
		
		
		realtion_between_abs_concerte sbi=new realtion_between_abs_concerte();
		sbi.insert_rate();
		sbi.display();
		sbi.compound_interest();
	}
	
	
}


