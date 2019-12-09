package com.capgemini.exception;

import java.io.File;
import java.io.IOException;


public class TestG {

	public static void main(String[] args) throws IOException {

		File f = new File ("pooja");
		f.createNewFile();
	}

}
