package herrricial_inhert;

public class child_two extends parent {
	
	static void child_wealth()
	{
		int child_wealth=70000;
		System.out.println("The wealth of child two is " + child_wealth);
	}


	public static void main(String[] args) {
		
		//calling childone class method 
				child_wealth();
				//calling parent class method is child one class 
				parent_age();
				child_two child_2= new child_two();
				child_2.parent_wealth();
	}

}
