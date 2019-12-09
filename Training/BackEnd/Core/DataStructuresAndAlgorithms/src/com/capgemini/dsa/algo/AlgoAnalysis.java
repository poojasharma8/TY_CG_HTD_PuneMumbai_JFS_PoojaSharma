package com.capgemini.dsa.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {

	public static void main(String[] args) {

	countingDuration2();
	System.out.println("-------------------------------------------------");
	countingDuration1();
	
	}

	public static long addUpto(Long number) {

		long total = 0L;
		for (long i = 0; i <= number; i++) {
			total = total + i;
		}

		return total;

	}// End of addUpto()

	public static long addUptoQuick(Long number) {

		return number * (number + 1) / 2;

	}// End of addUptoQuick()

	public static void countingDuration1() {

		long number = 9999999999L;

		Instant start = Instant.now();//Instant will store the time before execution of addUpto()
		System.out.println("addUpto : " + addUpto(number));
		Instant end = Instant.now(); //Instant will store the time after execution (at termination point) of addUpto()
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUpto time : " + seconds + " seconds ");

	}

	
	public static void countingDuration2() {

		long number = 9999999999L;

		Instant start = Instant.now();
		System.out.println("addUptoQuick : " + addUptoQuick(number));
		Instant end = Instant.now(); //Instant will store the time after execution (at termination point) of addUpto()
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration / 1000.0;
		System.out.println("addUptoQuick time : " + seconds + " seconds ");

	}

}// End of class
















