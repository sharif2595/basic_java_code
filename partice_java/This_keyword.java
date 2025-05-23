package partice_java;

public class This_keyword {
	
	int candidates_id;
	String cand_name;
	double cand_salary;
	
	void details(int candidate_id, String cand_name, double cands_salry)
	{
		this.candidates_id=candidate_id;
		this.cand_name=cand_name;
		this.cand_salary=cands_salry;
	}
	
	public static void main(String[] args) {
		
		This_keyword k1=new This_keyword();
		k1.details(5245, "zafar shareef", 143000);
		
		This_keyword k2=new This_keyword();
		k2.details(5245, "zafar shareef", 143000);
		System.out.println("Canditate id " + k2.candidates_id);
		System.out.println("Canditate name " + k2.cand_name);
		System.out.println("Canditate salary " +k2.cand_salary);
		
		System.out.println("Canditate id " + k1.candidates_id);
		System.out.println("Canditate name " + k1.cand_name);
		System.out.println("Canditate salary " +k1.cand_salary);
	}

}
