package com.jonathanwalsh;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void test() {
		Collection c = new Collection();
		assert c.add("head");                         // add a node
		assert c.add("tail");                         // add a node
		assert c.get(0).equals("head");               // node(0) == "head"
		assert c.get(1).equals("tail");               // node(1) == "tail"
		assert c.size()==2;                           // expect two (2) elements in the collection 
		
		assert c.removeItem(0);                       // remove an item
		assert c.size() == 1;                         // expect 1 element in the collection 
		
		assert c.add(0, "goat");                      // add "goat" at position zero (0)
		assert c.add("pig");                          // add "pig"
		assert c.size()==3;                           // expect size to be three (3)
		assert c.find("pig");                         // expect to find "pig"
		assert !c.find("goldfish");                   // do not expect to find "goldfish"
		
	}
	
}
