package abstraction;

public class SBI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("validating by sbi");
		
	}

	@Override
	public void getInfo() {
		System.out.println("getting info from sbi");
		
	}

}
