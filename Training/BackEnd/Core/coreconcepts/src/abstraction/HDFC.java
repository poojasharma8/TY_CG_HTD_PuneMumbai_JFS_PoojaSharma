package abstraction;

public class HDFC implements ATM {

	@Override
	public void validateCard() {
		System.out.println("validating from hdfc");
		
	}

	@Override
	public void getInfo() {
		System.out.println("getting info from hdfc");
		
	}
	

}
