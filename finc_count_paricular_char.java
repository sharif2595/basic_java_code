
public class finc_count_paricular_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="zafar shareef";
		
		String replace_str=a.replace("f", "");
		System.out.println("Repalce char " + replace_str);
		
		int count=a.length()-replace_str.length();
		
		System.out.println( "The count of a particular word "+count);

	}

}
