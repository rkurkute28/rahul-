package if_Statement;

public class If_else_control {

	public static void main(String[] args) {
		// Client Requirement
		// If My productivity is down 40 nos hr then give me notification"Ur Productivity is down"
		//If productivity is above or equal to 40 then show me " Good Productivity'
		int t = 39;
		
		if(t<40) {
			System.out.println("Ur productivity is down");
		}
		else {
			System.out.println("Good Productiveity");
		}
	}
}
