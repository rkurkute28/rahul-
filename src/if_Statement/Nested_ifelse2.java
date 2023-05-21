package if_Statement;

public class Nested_ifelse2 {

	public static void main(String[] args) {
		String un="Stock";
		String pwd="market&123";
		if (un=="Stoc") {// Here we put the wrong username
			System.out.println("YOur have entered the correct username");
		}else {
			System.out.println("You have entered wrong username");
			
		}
		 if(pwd=="market&12") {// Here we put the wrong password
			System.out.println("You have entered the correct username");
		}else {
			System.out.println("Yor have entered the wrong password");
		}

	}

}
