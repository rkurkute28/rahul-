package scanners;


import java.util.Scanner;





public class Scanner1 {


	   public static void main(String[] args) {
		System.out.println("....Personal Details....");
		System.out.println("Enter yout Detail");
		System.out.println("Enter yout Name");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("My Name is ="+name);
		System.out.println("Enter your current location ");
		String location=sc.nextLine();
		System.out.println("MY current location is ="+location);
		System.out.println("Please enter your experience");
		int exp=sc.nextInt();
		System.out.println("My current experience is ="+exp);
		

	}

	

}
