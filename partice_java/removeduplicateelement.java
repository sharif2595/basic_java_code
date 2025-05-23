package partice_java;

public class removeduplicateelement {

	public static void main(String [] args){
		
		int[] a= {1,2,2,3,4,5,5,6,8,8,6,};
		int len=a.length;
		int[] temp = new int [len];
		int j=0;
		
		for(int i=0; i<len-1; i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
			temp[j]=a[len-1];
			
			for(int z=0; z<=j; z++)
			{
				System.out.print(temp[z] + " ");
			}
		}
		
	
			
		}
			
	}


