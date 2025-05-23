package AB_54;

public class car_nonstatic {
	
	String name ="Zafar";
	
	public static void m1() 
	{
		car_nonstatic c1=new car_nonstatic();
		System.out.println(c1.name);
	}
	
	/*public void car_wheels(int no_wheels)
	{
		System.out.println("The no of wheels are " + no_wheels);
	}
	
	public void car_wheels(String companyname)
	{
		System.out.println("The company name of wheels are " + companyname);
	}
	
	public void car_wheels(int i, int j)
	{
		System.out.println("The Ground clearnace of wheels inare " + i  + j);
	}
*/
	public static void main(String[] args) {
		m1();
		/*object1.car_wheels(4);
		object1.car_wheels("MRF");
		object1.car_wheels(320,320);*/
		
	
	}
}
