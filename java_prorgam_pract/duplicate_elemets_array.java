package java_prorgam_pract;

import java.util.ArrayList;
import java.util.List;

public class duplicate_elemets_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
		
			for(int i=0; i<=arr.length-1; i++)
			{
				for(int j=i+1; j<=arr.length-1; j++)
					
					if(  (arr[i]==arr[j]) &&  (i!=j)  )
					{
						System.out.println(arr[j] + " ");
					}
			}
		
	}
	}


