package partice_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pratice_java {
	
	// 34200121200
	//output 00003421212
	
	public static void main(String[] args) {
		
		String s="34200121200";
		char[] arr=s.toCharArray();
		 char[] temp_arr= new char[s.length()];
		 int j=0;
		 
		 for(int i=0; i<arr.length-1; i++)
			 if(arr[i]!=0)
			 {
				 temp_arr[j]=arr[i];
				 j++;
				 
			 }
			 else
			 {
				 arr[i]=arr[i];
			 }
		 temp_arr[j]=arr[arr.length-1];
		 
		 for(int z=0; z<=temp_arr.length; z++)
		 {
			 System.out.println(temp_arr[z]);
		 }
		 
		
	}
		
		
	}
	
