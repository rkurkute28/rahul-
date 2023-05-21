package nonprimitive;

public class Nonstaticss {

	public static void main(String[] args) {
	Boolean b = 2>3;
    System.out.println(b);
    Nonstaticss.T1();
    Nonstaticss G = new Nonstaticss();
    G.T2();
	}
	public static void T1 () {
		Boolean b = 56>55;
		System.out.println(b);	
		}
    public void T2 () {
    	Boolean b = 100<10;
    	System.out.println(b);
    	
    }
}