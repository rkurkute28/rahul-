package encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		BankAccount y = new BankAccount();
		y.setBalance(9546);
		
		double bal = y.getBalance();
		
		System.out.println("Your Bank Balance is ="+bal);

	}

}
