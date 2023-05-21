package if_Statement;

public class Nested_else_if {
	
      // To Provide more than one Condition
	public static void main(String[] args) {
		int mark=64;
		
		if(mark==65) {
	        System.out.println("First class with distinction");

	    }
		else if(mark>=60&&mark<65){
		     System.out.println("First class");
		}
		else if (mark>=55&&mark<60) {
	         System.out.println("Higher second class");
		}
		else if (mark>=50&&mark<55) {
			 System.out.println("Second class");
	    }
		else if (mark>=45&&mark<50) {
			 System.out.println("Third class");
		}
		else if (mark>=40&&mark<45) {
			 System.out.println("Fourth class");
		}
		else if (mark>=35&&mark<40) {
			 System.out.println("Fifth class");
		}
		else if (mark>=30&&mark<35) {
			 System.out.println("Pappu fail ho gaya");
			 
		}

		}
	     	
	

}
