package Abstract_classes;

public class Pnb_bank extends bank_inseret_rate {

	@Override
	public void insert_rate() {
	
		System.out.println("The rate of interest for pbn is 7.81%");
		
	}
	public static void main(String[] args) {
		
		Pnb_bank pb=new Pnb_bank();
		pb.insert_rate();
		pb.display();
	}

	

}
