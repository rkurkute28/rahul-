package operator_program;

public class UnaryOperator {
	void Decrement() {
		// It is Pro_Fix Operator
		int b = 60;
		System.out.println(b);// 60 
		System.out.println(b--);// (60-1=59)output is 59
		System.out.println(b--);// 59 (59-1=58) output is 58
		System.out.println(b);// 58
		System.out.println(b--);// 58 (58-1=57) output is 57
		
	}

	public static void main(String[] args) {
		UnaryOperator R=new UnaryOperator();
		R.Decrement();
		
		
		

	}

}
