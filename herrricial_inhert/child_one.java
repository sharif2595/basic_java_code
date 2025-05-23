package herrricial_inhert;

public class child_one  extends parent{
	
	static void child_wealth()
	{
		int child_wealth=56000;
		System.out.println("The wealth of child one is " + child_wealth);
	}

	public static void main(String[] args) {
		
		//calling childone class method 
		child_wealth();
		//calling parent class method is child one class 
		parent_age();
		child_one child_1= new child_one();
		child_1.parent_wealth();
		
	}

}
