package Acess_specifer;

public class Case1_within_class {
	
	
	public void add()
	{
		System.out.println("add");
	}
	
	protected void sub()
	{
		System.out.println("sub");
	}
	
	 static void mul()
	{
		System.out.println("mul");
	}
	
	private void division()
	{
		System.out.println("div");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Case1_within_class c1=new Case1_within_class();
		c1.add();
		c1.sub();
		mul();
		c1.division();

	}

}
