package com.capgemini.thread;

public class PVR {

	synchronized void confirm() //object-locking
	{
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(i);
			
			if(i==0) {
			try {
				wait();
				Thread.sleep(1000);
			    } 
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	synchronized void leaveMe() {
			System.out.println("notify is called..");
			notifyAll();
		}
}
