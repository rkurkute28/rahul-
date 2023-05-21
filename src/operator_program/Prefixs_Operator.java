package operator_program;

public class Prefixs_Operator {
	void decrement() {
		int p=45;
		System.out.println(p);// 45
		System.out.println(--p);// 44
		System.out.println(--p);//43
		System.out.println(--p);//42
		System.out.println(p);//42
		System.out.println(--p);//41
}

	public static void main(String[] args) {
		Prefixs_Operator Z=new Prefixs_Operator();
		Z.decrement();
		
		

	}

}
