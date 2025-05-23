package type_casting;

public class typecasting_implicit_explicit {

	
	public static void main(String[] args) {
		
		
		//implicit type casting
		int a=100;
		double b=a;
		
		
		byte b1=100;
		short v=b1;
		
		short s=200;
		int z=s;
		
		int f=200;
		long c=f;
		
		long g=300;
		float d=g;
		System.out.println(d);
		
		float h=30.5f;
		double n=h;
		System.out.println(n);
		
		//explicity type casting
		
		double m=100.455676;
		float l=(float)m;
	
		System.out.println(m);
		System.out.println(l);
		
		//convert short to byte
				short a1=128; // -127 to 128
				byte b2=(byte) a1;
				System.out.println(b2);
				
				
				//covert int to short 
				
				int z1=404549545;
				short s1=(short)z1;
				System.out.println(s1);
		
		
		
	}
}
