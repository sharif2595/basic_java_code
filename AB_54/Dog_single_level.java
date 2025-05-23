package AB_54;

class Animal
{
	public static void animal_color()
	{
		System.out.println("The color of the animal is brown");
	}
}


public class Dog_single_level extends  Animal {
	
	public static void Dog_Voice()
	{
		System.out.println("Dog voice");
	}
	

	public static void main(String[] args) {
		
		animal_color();
		Dog_Voice();

	}

}
