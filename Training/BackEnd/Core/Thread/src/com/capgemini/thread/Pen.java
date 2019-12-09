package com.capgemini.thread;

public class Pen extends Thread{

	@Override
	public synchronized void run() {

		for(int i = 0 ; i <5 ; i++) {
			System.out.println(i);
			try {
				wait(1000);
				}
			
			catch (InterruptedException e)
				{
				e.printStackTrace();
				}
			}

		}

	}
