package operator_program;

public class ArithmaticOperator {
	int a=2556;
	int b =35;
           void arithmatic() {
        	   System.out.println(a+b);
        	   System.out.println(b-a);
        	   System.out.println(a*b);
        	   System.out.println(b/a);// devision condition we get output from Quatiant.
        	   System.out.println(a/b);
        	   System.out.println(b%a);// this is important operator please practice
        	   System.out.println(a%b);// % Condition we get output from Reminder 
        		                      // otherwiese output is devident
        	   
           }
           void arithmatics() {
        	   int R=15;
        	   int Y= 20;
        	  System.out.println(R%Y);
        	  System.out.println(Y%R);//Here this condition output is Reminder of divison rule.
        		
           }
	public static void main(String[] args) {
		ArithmaticOperator A=new ArithmaticOperator();
		
		A.arithmatic();
		
		A.arithmatics();

	}

}
