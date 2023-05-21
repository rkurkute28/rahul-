package operator_program;

public class RelationalOperator {
	
	void relational() {
		int x=300;
		int y=900;
		int z=300;
		int u=400;
		
		System.out.println(x==z);// x=300 = z=300 so output is true.
		System.out.println(y==z);//y=900 /z=300 not equal to So Output is false.
		System.out.println(x!=z);//Not Equal to to so output is false.
		System.out.println(x!=u);// x is not equal to u so output is True.
		System.out.println(x>u);
		System.out.println(y<z);
		System.out.println(x>=z);
		System.out.println(z<=y);


	}
	
	

	public static void main(String[] args) {
		RelationalOperator h=new RelationalOperator();
		h.relational();


	}

}
