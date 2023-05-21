package hirarchical;

public class HierarchicalMethod {

	public static void main(String[] args) {
          Bank y = new Bank();
          y.mainmethod();
          
         Kotak k=new Kotak();
         k.mainmethod();
         k.kotakbank();
         
         AxisBank a=new AxisBank();
         a.mainmethod();
         a.Axismethod();
         
         SBI s=new SBI ();
         s.mainmethod();
         s.sbibank();
          
	}

}
