package type_casting;


class A1
{
	void a1()
	{
		System.out.println("calling a1 method");
	}
}


class A extends A1
{
	void m1()
	{
		System.out.println("calling m1 method");
	}
}


public class class_casting extends A {
	
	void m2()
	{
		System.out.println("calling m2 method");
	}

	public static void main(String[] args) {
		
				 A c1= (A) new class_casting();// upcasting implicit
				 c1.m1();
				 
			//down casting explicity
				 
				// parent class reference varable = (parent class) new child class
				  
				 class_casting c2= (class_casting) new A();
				 c2.m2();
				 c2.m1();
				 
				
				
			
				 
	}			
	

}

