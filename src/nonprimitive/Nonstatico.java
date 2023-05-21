package nonprimitive;

public class Nonstatico {
       String W = "Bhagwat Geeta";//instance variable
       String Y = "Ramayan";// instance variable
       static String R = "Mahabharat";//static variable outsede method
    		   public static void main(String[] args) {
		           Nonstatico obj = new Nonstatico();
		           obj.krishna();
                   ram();
	}
    		   public static void ram() {
    			   String T = "Hare Ram";// local varible
    			   String U = "Om sai";//local variable
    			  String B = "Jay gajanan maharaj";
    			      System.out.println(U+" "+T);
    			      System.out.println(B+" "+R);
    			     
    			  
    		   }
    		   
              public void krishna() {
                   String N = "God pray";// local variable
                   String I = "bhagwamt";
                      System.out.println(N+" "+I+" "+W+" "+Y);
                      
                                          
            
              
              
            	  
            	  
              }
}
