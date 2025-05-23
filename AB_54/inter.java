package AB_54;


interface I1
{
	public static final int count=10;
	
	 void display();

}

public class inter implements I1 {

	public static void main(String[] args) {
		
		inter i1= new inter();
		i1.display();
	}
	
	
	@Override
	public void display() {
		
		System.out.println("The count of the product is " + I1.count);
		
		
	}

}
