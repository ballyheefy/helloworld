package com.jonathanwalsh.tester;

import com.jonathanwalsh.jmw1966.HelloWorld;

/*
 *
 * This class is intended to test the functionality of the HelloWorld class
 */
public final class HelloWorldTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld hw = new HelloWorld(); // we have to crate a dynamic object to invoke the constructor
		
		hw.SayHelloWorld();
		
		for(int i=0; i< 10 ; i++)
			hw.SayHelloWorld(i);

	}

}

