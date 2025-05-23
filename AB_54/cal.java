package AB_54;

public class cal {
	
	    // Method to add two integers
	    public void add(int a, int b) {
	         System.out.println(a + b);
	    }

	    // Method to add two doubles
	    public void  add(double a, double b) {
	    	System.out.println(a + b);
	    }

	    // Method to add three integers
	    public void add(int a, int b, int c) {
	    	System.out.println(a + b + c);
	    } 

	    // Method to concatenate two strings
	    public void add(String a, String b) {
	    	System.out.println(a + b);
	    }

	    public static void main(String[] args) {
	    	cal calc = new cal();

	        // Test cases
	       calc.add(5, 3); 
	       calc.add(2.5, 3.7);
	       calc.add(5, 3, 2);
	       calc.add("Hello", " World");
	    }
	}

