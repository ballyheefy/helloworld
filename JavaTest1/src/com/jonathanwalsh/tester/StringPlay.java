package com.jonathanwalsh.tester;

/**
 * 
 * @author jonth
 * 
 * This plays with string classes 
 *
 */

public class StringPlay {
	
	

	String s;
	StringBuilder sb; 
	StringBuffer sBuf;

	/**
	 *  Default constructor 
	 */
	public StringPlay(String s) {
		this.s = new String(s);
		this.sb = new StringBuilder(s);
		this.sBuf = new StringBuffer(s);
		
	}
	
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public StringBuilder getSb() {
		return sb;
	}

	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}

	public StringBuffer getsBuf() {
		return sBuf;
	}

	public void setsBuf(StringBuffer sBuf) {
		this.sBuf = sBuf;
	}
	
}
