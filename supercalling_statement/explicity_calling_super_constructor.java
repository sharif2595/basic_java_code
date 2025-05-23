package supercalling_statement;


class par
{
	par(float b)
	{
		System.out.println("Explicity calling one class constructor");
	}
}


class second extends par
{
	second(int a)
	{
		super(34.5f);
		System.out.println("Explicity calling second class constructor");
	}
}

public class explicity_calling_super_constructor extends second {
	
	explicity_calling_super_constructor()
	{
		super(5);
		System.out.println("Explicity calling thrid class constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		explicity_calling_super_constructor c1=new explicity_calling_super_constructor();
	}

}
