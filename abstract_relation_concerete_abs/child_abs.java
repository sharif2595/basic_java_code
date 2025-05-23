package abstract_relation_concerete_abs;


class grand_parent

{
	grand_parent()
	{
		System.out.println("Constructor class of grand parent");
		
	}
	
	void grand_parent_wealth()
	{
		System.out.println("Grand parent wealth rs10 ");
	}
}

abstract public class child_abs extends grand_parent {
	
	child_abs()
	{
		System.out.println("Constructor class od child abs");
	}
	
	abstract void child_parent_wealth();
	
	public static void main(String[] args) {// TODO Auto-generated method stub
		grand_parent gd1=new grand_parent();
		gd1.grand_parent_wealth();
	
	}
		
	}






