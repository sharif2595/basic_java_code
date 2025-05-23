package AB_54;



abstract class  product
{
	 final static int cart_count=10;
	
	abstract void add_cart();
	
	void display_cart_product()
	{
		System.out.println("display cart_product count from abstract class "+ product.cart_count);
	}
	
	}

public  class cart_products extends  product {

	static int cart_count=25;
	
	void delete_cart_product()
	{
		cart_products.cart_count=30;
		System.out.println("display cart_product count from child class "+ cart_products.cart_count);
	}
	
	
	public static void main(String[] args) {
		
		cart_products cart1=new cart_products();
		cart1.display_cart_product();
		
		
		//creating instance of class and object of child class 
		product p1=new cart_products();
		p1.add_cart();
		p1.display_cart_product();
	
		
	}


	@Override
	void add_cart() {
		cart_products.cart_count=35;
		System.out.println("Method calling form  add_cart from child class product new updated value of product is" + product.cart_count);
		
	}

}
