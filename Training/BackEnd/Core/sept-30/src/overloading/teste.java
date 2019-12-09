package overloading;

public class teste {

	public static void main(String[] args) {
		Facebook f =new Facebook();
		f.login("pooja123", 12345678);//final methods can be overloaded
		f.login("pooja","sharma");
	}

}
