
public class First_letter {
	
public static void main(String[] args) {
	
	String str="  i am      zafar   ";	
	String replace_string=str.replaceAll("\\s{2,}"," ").trim();
	System.out.println(replace_string);
    String[] words=replace_string.split(" ");
    for(String word: words)
    {  
    	
    	System.out.print(word.substring(0,1).toUpperCase()+word.substring(1, word.length())+ " ");
    }
  
	
	
	
	
	
}
}
