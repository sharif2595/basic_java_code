package AB_54;

import java.util.Scanner;

public class Switch_case {
	
	Scanner sc= new Scanner(System.in);
	
	
	static void cal_percentage()
	{
	
		System.out.println("Enter the marks for 5 subject out of 100 :- ");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks for physic subject out of 100");
		int phy= sc.nextInt();
		System.out.println("Enter the marks for Chemistry subject out of 100");
		int chem= sc.nextInt();
		System.out.println("Enter the marks for Biology subject out of 100");
		int bio= sc.nextInt();
		System.out.println("Enter the marks for Math subject out of 100");
		int math= sc.nextInt();
		System.out.println("Enter the marks for Computer subject out of 100");
		int comp= sc.nextInt();
		
		//calculate percentage 
		int  Total_value=phy+chem+bio+math+comp;
		int percent= (Total_value*100)/500;
		System.out.println(percent);
		
		//switch case
		String grade = null;
		switch(percent/10) {
	        // for >= 90
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        // for >= 80 and <90
	        case 8:
	           grade = "B";
	           break;
	        // for >= 70 and <80
	        case 7:
	           grade = "C";
	           break;
	        // for >= 60 and <70
	        case 6:
	           grade = "D";
	           break;
	        // for >= 50 and <60
	        case 5:
	           grade = "E";
	           break;
	        // for < 50
	        default:
	           grade = "F";
	           break;
	      }
	
		 System.out.println("Grade = " + grade);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*8Using switch statement Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

			Percentage >= 90% : Grade A

			Percentage >= 80% : Grade B

			Percentage >= 70% : Grade C

			Percentage >= 60% : Grade D

			Percentage >= 40% : Grade E

			Percentage < 40% : Grade F */
		
		cal_percentage();
		 
		

	}

}
