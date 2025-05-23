package AB_54;


class Ab
{
	Ab(int a)
	{
		System.out.println(" calling via a super calling statement of Constructor class AB ");
	}

}


class bcs extends Ab 
{
	bcs(float b)
	{
		super(5);
		System.out.println("calling via a super calling statement of Constructor class bcs ");
	}
}

public class test extends bcs {
	
	test()
	{
		super(6.5f);
		System.out.println("calling via a super calling statement of Constructor test class");
	}

public static void main(String[] args) {
	
	test t=new test();
	
}
}
