package abstract_relation_concerete_abs;

	public class grand_child extends child_abs
	{

		@Override
		void child_parent_wealth() {
			System.out.println("The child parent wealth is rs 20");	
		}
		
		public static void main(String[] args) {
			
			grand_child gc2=new grand_child();
			gc2.child_parent_wealth();
			gc2.grand_parent_wealth();
			
			
		}
		}

