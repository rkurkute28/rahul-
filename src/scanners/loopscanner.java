package scanners;
import java.util.Scanner;
public class loopscanner {

	public static void main(String[] args) {
		System.out.println("......Personal Details....");
		System.out.println("Enter yout details");
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			System.out.println("your Name is ="+name);
			System.out.println("Your age is ");
			int age=sc.nextInt();
			System.out.println("Your age is ="+age);
			System.out.println("Your current Salary");
			int salary =sc.nextInt();
			System.out.println("Your salary is ="+salary);
			sc.close();
			
			
			


	}

}

