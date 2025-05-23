package AB_54;


abstract class  bd
{
	
	String name ="Zafar";
	int age=30;
	
	abstract void age();
	
	void name()
	{
		System.out.println("The name is " + name);
	}
	
}

public class child_1  extends bd{
	
	String child_name="zack";
	
	void child_name()
	{
		System.out.println("The name is " + child_name);
	}
	

	public static void main(String[] args) {
		
		child_1 ch1=new child_1();
		ch1.age();
		ch1.child_name();
		ch1.name();
	}

	@Override
	void age() {
		// TODO Auto-generated method stub
		
		System.out.println("The age of zafar is" + age);
		
	}

}
