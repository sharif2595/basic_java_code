package multiple_inhert;


interface A1
{
	
	void add(int x, int y);
	void sub(int a, int b);
}

interface B2
{
	void multiply(int c, int d);
	void division(int f, int g);
}

class imple implements A1,B2
{

	@Override
	public void add(int x, int y) {
		int c= x+y;
		System.out.println("Addition" + "=" + x + "+" + y + "=" + c);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int c= a-b;
		System.out.println("sub" + "="+ a  + "-" + b + "=" + c);
	}

	@Override
	public void multiply(int c, int d) {
		// TODO Auto-generated method stub
		int z= c*d;
		System.out.println("multiply" + "=" + c + "*" + d + "=" + z);
		
	}

	@Override
	public void division(int f, int g) {
		// TODO Auto-generated method stub
		
		float v= f/g;
		System.out.println("division = " + f + "/"+ g + "=" + v);
	}
	
}

public class multiple_inhert_eg {
			
	public static void main(String[] args) {
		
		imple cal=new imple();
		cal.add(5,6);
		cal.sub(10, 2);
		cal.multiply(2, 3);
		cal.division(20, 10);
		
	}
	
}
