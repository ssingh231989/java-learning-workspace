package com.interview.hackrank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Supp {

	public void test() throws FileNotFoundException {

		// Assigning null value to object of FileInputStream
		FileInputStream GFG = null;

		// Try block to check for exceptions
		try {

			// Giving path where file should exists to read
			// content
			GFG = new FileInputStream("/home/mayur/GFG.txt");
		}

		// Catch block to handle exceptions
		catch (FileNotFoundException e) {

			// Display message when exception occurs
			System.out.println("File does not exist");
		}
	}
}

public class SuperClassException extends Supp{
	public void test() throws ArithmeticException {
		
	}
	public static void main(String arg[]) {
		
		SuperClassException se = new SuperClassException();
		se.test();
	}
	
}
