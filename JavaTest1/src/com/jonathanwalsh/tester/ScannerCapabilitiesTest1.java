package com.jonathanwalsh.tester;

import java.util.Scanner;

import org.junit.Test;

import com.jonathanwalsh.scanner.ScannerCapabilities;

import junit.framework.TestCase;

// next step is to make these parmaterized tests 
public class ScannerCapabilitiesTest1 extends TestCase {
	
	

	public ScannerCapabilitiesTest1 () {
		
	}
	@Test
	public void test1() {
		int x;
		ScannerCapabilities sc = new ScannerCapabilities();
		
		x = sc.getIntWithPrompt(new Scanner(System.in),"enter an integer : ");
		System.out.println("value entered : "+ x);
		assert x > 0;
	}
}
