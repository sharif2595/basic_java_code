
class P{
	
	public static void m1()
	{
		System.out.println("parent method");
	}
	
	
}

class C extends P{
	
	public static void m1()
	{
		System.out.println("child method");
	}
	
	
}




public class Method_hiding {


	public static void main(String[] args) {
		
		P p1= new P();
		p1.m1();
		
		
		C c1= new C();
		c1.m1();
		
		P pc=new C();
		pc.m1();
		
		

	}

}
