package com.jonathanwalsh.tester;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class StringPlayTest {

	@Test
	public void test() {
		StringPlay sp = new StringPlay("Test String");
		
		assert sp.getS().equals("Test String");
		assert sp.getSb().toString().equals("Test String");
		assert sp.getsBuf().toString().equals("Test String");
		
	}
	
	@Test
	public void test1() {
		StringBuilder sb = new StringPlay("FIRST").getSb();
		
		assert sb.length() == 5;
		assert sb.reverse().toString().equals("TSRIF");
		// System.out.println(sb);
	}
	
	@Test 
	public void test2() {
		
		Scanner scan = new Scanner(new String("This is the text that we need to scan"));
		scan.useDelimiter(new String(" ")); // just to be safe
		String tests[] = {"This","is","the","text","that","we","need","to","scan"};
		String token;
		int i=0;
		while(scan.hasNext()) {
			token = new String(scan.next());
			assert token.equals(tests[i++]);
			
		}
		scan.close();
		
	}
}
