package scanners;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
	   System.out.println("//////Personal Details//////");
	   System.out.println("Please Fill the Imformation in CAPILAL letter");
	   System.out.println("Enter You Name ");
	   Scanner t=new Scanner(System.in);
	   String name;
	   name=t.nextLine();
	   System.out.println("My Name is = "+name);
	   System.out.println("PLease enter your PIN no");
       int a;
       a=t.nextInt();
       System.out.println("My PIN no is = "+a);
       System.out.println("Please enter Flat No.");
       int b =t.nextInt();
       System.out.println("MY Flat No. is ="+b);
          System.out.println("Please Enter BIke No");
          int c =t.nextInt();
          System.out.println("My Bike no is ="+c);
       System.out.println("Here enter please bike amount");
       double amt;
       amt=t.nextDouble();
       System.out.println("MY Bike name is ="+amt);
          System.out.println("Please Enter your salary =");
          double sal;
          sal=t.nextDouble();
          System.out.println("MY current salary is ="+sal);
          t.close();
       
	}

}
