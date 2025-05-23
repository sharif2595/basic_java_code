package AB_54;

import java.util.Scanner;

public class find_max_switch {

	
	static void find_max() 
	{
		System.out.println("Find max between 2 numbers using switch case");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number :- ");
		int first_no=sc.nextInt();
		System.out.println("Enter second number :- ");
		int second_no=sc.nextInt();
		int max_number=0;
		if(first_no>second_no)
		{
			max_number=0;
		}
		else if(second_no>first_no )
		{
			max_number=1;
		}
		else if (first_no==second_no)
		{
			max_number=2;
		}
		
		switch(max_number)
		{
		case 0: 
			System.out.println(first_no+ "is greater than " + second_no);
			break;
		case 1: 
			System.out.println(second_no+ "is greater than " + first_no);
			break;
		case 2: 
			System.out.println("Both number are equals");
			break;
		default:
			System.out.println("Invaild input");
			break;
		}

	}

	public static void main(String[] args) {
		
		find_max();
	}

}
