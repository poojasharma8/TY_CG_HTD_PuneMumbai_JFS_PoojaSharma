package com.capgemini.thread;

public class TestP {

	public static void main(String[] args) {

		PVR a = new PVR();
		Paytm t1 = new Paytm (a);
		t1.start();
		
		Paytm t2 = new Paytm (a);
		t2.start();
		
		try {
			Thread.sleep(1000);
		    }
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.leaveMe();
	}

}
