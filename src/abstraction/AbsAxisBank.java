package abstraction;

public class AbsAxisBank extends AbstractionClass {
 
	 public void Bank1(){
		 System.out.println("Welcome to the Axis Bank plese provide the personal details");
	 }
	 public void name() {
		 System.out.println("Your name is = Rahul Kurkute");
	 }
	 public void aadharno() {
		 System.out.println("Please tell your aadhar no = 853585783014");
	 }
	 public void panno() {
		 System.out.println("Yours Pan no = cnpk7625p");
	 }
	 public void mobno() {
	 System.out.println("your mobile no = 96733351034");
	 }
	public static void main(String[] args) {
		AbstractionClass w=new AbsAxisBank();
		w.accountopen();
        w.Bank1();
		w.aadharno();
		
		w.name();
		w.panno();
		w.mobno();
		w.accountCreated();
		

	}

}
