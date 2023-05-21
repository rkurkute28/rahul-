package scanners;
import java.util.Scanner;
public class Userinputss {

	public static void main(String[] args) {
	System.out.println("Name = rahul kurkute");
	Scanner g=new Scanner(System.in);
	String name;
	name=g.nextLine();
	System.out.println("My name is =" + name);
	
    System.out.println("Address= Moshi pune maharashtra");
	System.out.println("Education= BE Electrical");
	System.out.println("Occupation= Sr. Engineer");
	System.out.println("College= Raisoni college of Engineering");
	System.out.println("passout year = 2016");
	int p;
	p=g.nextInt();
	System.out.println("My passout your is ="+p);
	System.out.println("Email id= rkurkute35@gmail.com");
	System.out.println("status= working");
	System.out.println("Thank you");
	int w;
	w=g.nextInt();
	System.out.println(" Stay health  "+w);
	
	g.close();
	}

}



