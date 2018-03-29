package ScannerTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

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
			{2,2,4}, // 2+2 = 4
			{2,3,5}, // 2+3 = 5
			{4,1,8}  // 4+1 = 5 
		}; 
		return Arrays.asList(datalist);
	}
	
	@Before 
	public void setuptest() {
		sc = new ScannerCapabilities();
	}
	
	@Test
	/*
	 * This function will run once per instance in the array datalist defined above 
	 */
	public void test() {
		assert (expected == sc.adder(val1, val2));
	}

}// end of class 
