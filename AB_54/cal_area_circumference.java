package AB_54;

import java.util.Scanner;

public class cal_area_circumference {
	
	//area of circle 
	public static void circle_area()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of circle radius to calculate the area of a circle  :- ");
	int rad_value=sc.nextInt();
	double circle_area=Math.PI*rad_value*rad_value;
	System.out.println("The area of a circle is " + circle_area);
	}

	//circumfrence of a circle 
	public static void circumference_circle()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of radius  to calculate the circumference of a circle  :- ");
	int rad_value=sc.nextInt();
	double circle_circumference= 2*Math.PI*rad_value;
	System.out.println("The circumference of a circle is " + circle_circumference);
	}
  
	//area of triangle
	public static void triange_area()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of breadth and height to calculate area of a triangle");
	System.out.println("Enter the value of breadth :- ");
	double breadth=sc.nextDouble();
	System.out.println("Enter the value of height :- ");
	double height=sc.nextDouble();
	double area_triangle=0.5*breadth*height;
	System.out.println("The area of a triangle is " + area_triangle);
	}
	
	//circumference of a triangle
	public static void circumference_triangle()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Calculate the circumference of a triangle ");
	System.out.println("Enter the value of all side of lenghts :- ");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	double triangle_circumference= a+b+c;
	System.out.println("The circumference of a triangle is " + triangle_circumference);
	}

	//area of a rectangle
	public static void rectangle_area()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Calculate the area of a rectangle ");
	System.out.println("Enter the value of lenght");
	double lenght=sc.nextDouble();
	System.out.println("Enter the value of breadth");
	double breadth=sc.nextDouble();
	double rectangle_area=lenght*breadth;
	System.out.println("The area of a rectangle is " + rectangle_area);
	}

	//circumference of a rectangle 
	public static void rectangle_circum()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Calculate the cicumference of a rectangle ");
	System.out.println("Enter the value of lenght");
	double lenght=sc.nextDouble();
	System.out.println("Enter the value of breadth");
	double breadth=sc.nextDouble();
	double rectangle_circumf=2*(lenght+breadth);
	System.out.println("The circumference of a rectangle is " + rectangle_circumf);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle_area();
		circumference_circle();
		 triange_area();
		circumference_triangle();
		rectangle_area();
		rectangle_circum();
	}

}
