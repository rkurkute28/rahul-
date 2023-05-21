package operator_program;

public class Logicaloperator {

	public static void main(String[] args) {
	int p=150;
	int q=350;
    int r=450;
	int s=950;
	// Logical && don't check the second Condition if first Condition is false.
	// Logical AND && Operator Program.
	System.out.println(r>q&&s>p);// True && True = True
	System.out.println(q<s&&p>q);// True && false =false 
	System.out.println(r<q&&p>r);//false && false=false
    System.out.println(q==s&&s>p);//false && True=false
    
    // Bitwise AND & Operator Program.
    //The bitwise & operator always checks both conditions whether first condition is true or false
    System.out.println(r>q&s>p);// True && True = True
	System.out.println(q<s&p>q);// True && false =false
	System.out.println(r<q&p>r);//false && false=false
    System.out.println(q==s&s>p);//false && True=false
    
    

	}

}
