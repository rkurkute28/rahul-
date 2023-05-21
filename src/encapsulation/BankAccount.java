package encapsulation;

public class BankAccount {

           private	double balance;
           
           public double getBalance() {
        	   
        	   return balance;
        	   
           }
           public void setBalance(double balance) {
        	   if (balance<15000) {
        		   
        		   this.balance=balance;
        	   }
        	   
        	
           }

}
       