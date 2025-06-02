
public class Swap_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Zafar";
		String b="Shareef";
		
		a=a+b;
		System.out.println(a.length());
		 
		b=a.substring(0, a.length()-b.length());
		
		System.out.println(b);
		
		a =a.substring(b.length());
				System.out.println(a);
				

	}

}
