package AB_54;


class grand_parent
{
	
	grand_parent(int a)
	{
		System.out.println("calling constructor of grand_parent_class");
	}
	
	String color="brown";
	public  void grand_feature()
	{
		
		System.out.println("Grand_parent color is" + color);
	}
	
}

class parents extends grand_parent
{
	
	parents()
	{
		super(3);
		System.out.println("calling parent class constructor");
	}
	
	public void parent_feature()
	{

		String color="fair";
		System.out.println("Parents colors is " + color);// aceessing the color of parent class 
		System.out.println("grand parents  colors is " + super.color); // accessing the color of grandparent class with the help of superkeyword
		super.grand_feature();// accessing the method of grand parent class 
		
	
	}
	
}


public class Super_keyword_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		parents p1=new parents();
		p1.parent_feature();
	}

}
