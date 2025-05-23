package abstract_class_relation_abstract_class;


abstract class bike
{
	 abstract void  bike_name();	 
}


abstract class bike_part extends bike
{
	 abstract void  bike_engine();
	 
	 abstract void  bike_body_part();
	 
}

public class abstract_relationship_abstract_honda extends bike_part {
	
	public static void main(String[] args) {
		
		abstract_relationship_abstract_honda cbr = new abstract_relationship_abstract_honda();
		cbr.bike_name();
		cbr.bike_engine();
		cbr.bike_body_part();
		
	}

	@Override
	void bike_engine() {
		System.out.println("Cthe engine power is 1200cc");
		
	}

	@Override
	void bike_body_part() {
		System.out.println("Color of the body is red");
		
	}

	@Override
	void bike_name() {
		System.out.println("Bike name is Honda CBR 1000 fire blade edition");
		
	}
	

}
