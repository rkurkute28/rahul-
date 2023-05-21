package operator_program;

public class Logical_BitwiseOR {

	public static void main(String[] args) {
		int p=150;
		int q=350;
	    int r=450;
		int s=950;
		// Logical OR || don't check the second Condition if first Condition is True.
		// Logical OR || Operator Program.
		System.out.println(r>q||s>p);
		// True && True = True is O/p of Logical AND// output Logical OR || is True
		System.out.println(q<s||p>q);
		// True && false =false  is O/p of Logical AND // output Logical OR || is True;
		System.out.println(r<q||p>r);
		//false && false=false  is O/p of Logical AND//output Logical OR || is False.
	    System.out.println(q==s||s>p);
	    //false && True=false  is O/p of Logical AND//output Logical OR || is True	    
	    // Bitwise OR | Operator Program.
	    //The bitwise | operator always checks both conditions whether first condition is true or false
	    System.out.println(r>q|s>p);
	    // True && True = True is the output of Bitwise AND// output Bitwise OR | is True.
		System.out.println(q<s|p>q);
		// True && false =false is the output of Bitwise AND// output Bitwise OR | is True
		System.out.println(r<q|p>r);
		//false && false=false is the output of Bitwise AND// output Bitwise OR | is False
	    System.out.println(q==s|s>p);
	    //false && True=false is the output of Bitwise AND// // output Bitwise OR | is True.
	    

	}

}
