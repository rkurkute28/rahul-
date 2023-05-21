package switchstatement;

public class SwitchStatement1 {

	public static void main(String[] args) {
		int even=1;
		int odd=6;
		System.out.println("This is even no");
		switch (even) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("3 ");
		case 3:
			System.out.println("5 ");
		case 4:
			System.out.println("7 ");break;
		case 5 :
		System.out.println("This is odd no");
		switch(odd) {
		
		case 5: 
			System.out.println("0 is the odd no");
		case 6:
			System.out.println("2 is the odd no");
		case 7:
			System.out.println("4 is the odd no");
		case 8:
			System.out.println("6 is the odd no");
		default :
			System.out.println("This is the not even no.");
			
			}
		
		}

	}

}
