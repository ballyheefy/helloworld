package com.jonathanwalsh.jmw1966;



public class HelloWorld {
	
	// This is similar to a #define in C or C++ for those who have programmed in those languages.
	private static final String Output = new String("Hello World");
	
	HelloWorld() { // null constructor 
		
		
	}
	
	public void SayHelloWorld() {
		System.out.println(Output); // pop out a message 
	}
	public void SayHelloWorld(int i) {
		System.out.println(Output +" : "+ i); // pop out a message 
	}

} // end of class 
