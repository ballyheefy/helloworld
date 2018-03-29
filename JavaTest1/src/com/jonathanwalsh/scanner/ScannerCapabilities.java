package com.jonathanwalsh.scanner;



import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerCapabilities {
	
	
	// default constructor 
	public ScannerCapabilities() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	/*
	 * This takes a prompt and returns and integer returning the status of the scan the user of this function must evaluate 
	 * the scanstate variable to understand if this worked 
	 */
	public int getIntWithPrompt(Scanner s, String prompt) {
		
		System.out.print(prompt);
		try {
			if(s.hasNextInt()) {
				int x = s.nextInt();
				return x; 
			}
		} catch (IllegalStateException  e) {
			System.err.println("Illegal state");
			e.printStackTrace();
		} catch (NoSuchElementException e)  {
			System.err.println("No Such element");
			e.printStackTrace();
		} finally {
			// nothing to do here left for sake of completeness 
		}
		return 0;
	}

	// this is a BS method to show parameterized test in action 
	public int adder(int a, int b) {
		return a+b;
	}
}
