package com.jonathanwalsh.tester;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.jonathanwalsh.scanner.ScannerCapabilities;



@RunWith(Parameterized.class)
public class ScannerTestParam {
	
	private int val1;
	private int val2;
	private int expected; 
	ScannerCapabilities sc;

	public ScannerTestParam(int a, int b, int c) {
		this.val1 = a;
		this.val2 = b;
		this.expected = c;
	}
	
	@Parameters
	public static Collection<Object []> data() {
		// These are the parameters that are passed every time the test is called 
		Object datalist [][] = new Object [][] {
			/* {val1, val2, expected sum} */
			{2,2,4}, // 2+2 = 4
			{2,3,5}, // 2+3 = 5
			{4,1,5}  // 4+1 = 5 
		}; 
		return Arrays.asList(datalist);
	}
	
	@Before 
	public void setuptest() {
		sc = new ScannerCapabilities();
	}
	
	@After
	public void cleanuptest() {
		// perform any clean up needed 
	}
	
	@Test(timeout=500)
	/*
	 * This function will run once per instance in the array datalist defined above it is easy to add more tests by adding more tupples to the data list
	 */
	public void test() {
		assert (expected == sc.adder(val1, val2));
	}

}// end of class 
