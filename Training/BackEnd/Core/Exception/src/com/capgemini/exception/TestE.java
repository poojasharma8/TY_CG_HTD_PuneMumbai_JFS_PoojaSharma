package com.capgemini.exception;

import java.io.File;
import java.io.IOException;

public class TestE {
	public static void main(String[] args) {
		
		
		System.out.println("Main started");
		File f = new File ("Pooja.txt");
		try {
			f.createNewFile();
			System.out.println("File created");
		}
		catch(IOException e) {
			System.out.println("sorry not able to create the file");
		}
		System.out.println("Main Ended");
		
	}

}
