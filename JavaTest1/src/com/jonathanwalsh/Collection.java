package com.jonathanwalsh;
import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	
	/*
	 * Default constructor 
	 */
	public Collection () {
		this.sal = new ArrayList<>();
		
	}
	
	
	public boolean add(String s) {
		return this.sal.add(s);
	}
	
	public boolean add(int idx, String s) {
		if( idx >= 0 ) {
			try {
				this.sal.add(idx, s);
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
			
	} 
	
	public boolean find(String s) {
		Iterator<String> i = this.sal.iterator();
		while(i.hasNext()) {
			if( s.equals(i.next()) ) {
				return true;
			}
		}
		return false;
	}

	String get(int index) {
		return this.sal.get(index);
		
	}
	
	public boolean removeItem(int idx) {
		int listSize = this.sal.size()-1;
		if( (listSize < idx) || (idx < 0) )
			return false;
		try {
			this.sal.remove(idx);
		} catch (IndexOutOfBoundsException e) {
			// with the checks above this should never happen in a single threaded application it is possible in a threaded environment that that it could (bad design)
			e.printStackTrace();
		}
		return true;
	}
	
	int size() {
		return this.sal.size();
	}
	
	public int dump() {
		Iterator<String> i = this.sal.iterator();
		int c=0;
		while(i.hasNext()) {
			System.out.println(i.next());
			c++;
		}
		return c;
		
	}
	
	/*
	 * Private variables 
	 */
	
	private ArrayList<String> sal; // note this has to have an object created in the constructor.
}
