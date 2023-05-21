package logicalprogram;

public class EvenOddRange {

	// To find the Even Odd No between 1200 to 1300
	public static void main(String[] args) {
		int a;
		
		for(a=1200; a<=1400; a++) {
			
			if (a%2==0) {
				
				System.out.print(a+" Number is Even ");
			}
			else {
				
				System.out.println (a+" Number is odd");
			}
			
		}

	}

}
