package AB_54;

import java.util.Scanner;

public class max_three_switch {
	
	void find_max_three()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("find max number among 3 numbers using switch case");
		System.out.println("Enter first number :- ");
		int a=sc.nextInt();
		System.out.println("Enter second number :- ");
		int b=sc.nextInt();
		System.out.println("Enter third number :- ");
		int c=sc.nextInt();
		int max_value=0;
		if(a>b && a>c)
		{
			max_value=0;
		}
		else if(b>a && b>c)
		{   
			max_value=1;
		}
		else if(c>a && c>b)
		{
			max_value=2;
		}
		else if (a==b && b==c)
		{
			max_value=3;
		}
		
		switch(max_value)
		{
		case 0:
			System.out.println(a + "greater than" + b + "greater than" + c );
			break;
		case 1:
			System.out.println(b + "greater than" + a + "greater than" + c );
			break;
		case 2:
			System.out.println(c + "greater than" + a + "greater than" + b);
			break;
		case 3:
			System.out.println("All the 3 values are equal");
			break;
		}
	}

	public static void main(String[] args) {
		
		max_three_switch max= new max_three_switch();
		max.find_max_three();

	}

}
