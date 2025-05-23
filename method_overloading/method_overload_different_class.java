package method_overloading;

public class method_overload_different_class {
	
	void add()
	{
		System.out.println(" non static method Addition calling from other class ");
	}

	public static void main(String[] args) {
	
		//calling method from differnt class 
		class_one c1=new class_one();
		c1.add(333.244d);
		
		//caling same method in different class by providing the class name of that class
		class_one.add(5);
		class_one.add(34.5f);

	}

}
