package abstraction;

public class AbsHDFCBank extends AbstractionClass {

	public void Bank1() {
		System.out.println("Welcome to HDFC bank Please provide the details");
	}
	public void name() {
		System.out.println("Name = Rahul kurkute");
	}
    public void aadharno(){
    	System.out.println("Aadhar No= 855235698546");
    	
    }
    public void mobno() {
    	System.out.println("Mobile no=96733351094");
    	
    }
     public void panno() {
    	 System.out.println("Pan no= cnpl7215p");
    	 
     }

	public static void main(String[] args) {
		AbstractionClass t=new AbsHDFCBank();
		// This the referrence of the Abstract class
		t.accountopen();
		t.Bank1();
		t.name();
		t.aadharno();
		t.mobno();
		t.panno();
		t.accountCreated();

	}

}
