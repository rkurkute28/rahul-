package operator_program;

public class OperatorUnary {
	void increment() {
		// It is Pro_Fix Operator

		int a = 25;
		System.out.println(a);//25
	    System.out.println(a++);//25  (25+1=26)output is 26
	    System.out.println(a++);//26   (26+1=27) output is 27
	    System.out.println(a);//27
	    System.out.println(a++);//27   For next (27+1=28) output is 28
	    
	}
	    public static void main(String[] args) {
	    OperatorUnary Y=new OperatorUnary();
	    Y.increment();

	}

}
