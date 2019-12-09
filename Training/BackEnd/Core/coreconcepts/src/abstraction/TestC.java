package abstraction;

public class TestC {


	public static void main(String[] args) {
		 
		Machine m = new Machine();
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		SBI s =new SBI();
		m.slot(i);
		
	}

}
