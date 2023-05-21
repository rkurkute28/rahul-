package switchstatement;

public class SwitchStatements {

	public static void main(String[] args) {
		int day =8;  // text value.
		switch (day) {
		case 1:
			System.out.println("Today is Monday");
		case 2: 
			System.out.println("Today is Tuesday");break;
		case 3:
			System.out.println("Today is Wensday");
		case 4:
			System.out.println("Today is Thusday");break;
		case 5: 
			System.out.println("Today is Friday");
		case 6:
			System.out.println("Today is Suturday");break;
		case 7:
			System.out.println("Today is Sunday");
		default:
			System.out.println("Please Provide case below 7 otherwise default is print ");
		}
		

	}

}
