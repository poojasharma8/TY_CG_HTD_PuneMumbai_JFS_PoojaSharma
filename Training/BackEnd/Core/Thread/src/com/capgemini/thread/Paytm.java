package com.capgemini.thread;

public class Paytm extends Thread {
	
	PVR r;
	
	public Paytm (PVR r) {
		this.r = r;
		
	}
  @Override
  public void run() {
	  
	  r.confirm();
  }
}
