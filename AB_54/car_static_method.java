package AB_54;

public class car_static_method {

	
	public static void Wheel (int no_Wheels)
	{
		System.out.println("The no of wheels are " + no_Wheels);
	}
	
	public static void Wheel(double d, double e , double f , double g)
	{
		System.out.println("The car tyre dimension are" + " Wheels 1 "+  d + " wheeel 2" + e  + " wheeel 3" + f  + " wheeel 4" + g );
	}
	
	public static void Wheel(String color)
	{
		System.out.println("The color of the wheeels are " + color);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methods are called 2 ways 
		// 1 by class name . method name 
		// 2 directly by method name 
		
		
		// calling by 1 way
		car_static_method.Wheel(4);
		car_static_method.Wheel(17.2, 17.2, 17.2, 17.2);
		car_static_method.Wheel("Black");
		
		
		// calling by second way
		Wheel(4);
		Wheel(18.2, 18.2, 18.2, 18.2);
		Wheel("Black");
		
	}

}
