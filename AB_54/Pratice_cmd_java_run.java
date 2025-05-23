package AB_54;

import java.util.Scanner;

public class Pratice_cmd_java_run {
	
	  public static void main(String[] args)
	    {
		  
		  	Scanner sc=new Scanner(System.in);
		  	System.out.println("Input start number");
		  	int start_num=sc.nextInt();
			System.out.println("Input End number");
		  	int end_num=sc.nextInt();
		  	
		  	for(int i=start_num; i<=end_num; i++)
		  	{
		  		if(i%2==0)
		  		{
		  			System.out.println("Even number " + i);
		  		}
		  		else  
		  		{
		  			if(i%2==1)
		  			{
		  				System.out.println("Odd number " + i);
			  		}
		  			}
		  	}
		  }
	    }
