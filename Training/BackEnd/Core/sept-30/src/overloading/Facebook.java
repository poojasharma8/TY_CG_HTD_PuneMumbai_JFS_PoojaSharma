package overloading;

public class Facebook {
	
	final void login(String password , long phone) {
	System.out.println("login by phone");	
	}
    final void login(String email , String password) {
		System.out.println("login by email");
	}
	
}
