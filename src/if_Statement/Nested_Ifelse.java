package if_Statement;

public class Nested_Ifelse {

	public static void main(String[] args) {
		String un="rahul";
		String pwd="123@k";
		
		if (un=="rahul") {
			if(pwd=="123@p") {
				System.out.println("Your successfully sign in");
			}else {
				System.out.println("Your have entered wrong password");
			}
			
		}else {
			System.out.println("You have entered wrong username");
		}

	}

}
