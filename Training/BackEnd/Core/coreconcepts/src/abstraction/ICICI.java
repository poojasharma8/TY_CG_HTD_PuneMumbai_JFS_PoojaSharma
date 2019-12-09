package abstraction;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("validating from icici");
		
		
	}
	@Override
	public void getInfo() {
		System.out.println("getting info from icici");

	}
}