package if_Statement;

public class If_else1_control {

	public static void main(String[] args) {
		// Client Requirement.
		//In my bookmyshow app give the notification  when cinema hall seat full above 80 show me " Ticket full"
		// and seat below 80 show me " Seat availability "
		 
		int s=81;
				
		
		if (s>80) {
			System.out.println("Ticket full");
		}
		else {
			System.out.println("Seat Availability");
		}

	}

}
