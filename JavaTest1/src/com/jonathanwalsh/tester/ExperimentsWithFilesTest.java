package com.jonathanwalsh.tester;

import java.io.File;

import org.junit.Test;

import com.jonathanwalsh.ExperimentsWithFiles;

public class ExperimentsWithFilesTest {
	File f;
	
	@Test
	public void test() {
		
		ExperimentsWithFiles ewf = new ExperimentsWithFiles();
		f = ewf.OpenFile("data.txt");
		assert f.exists();
	}
	// Open a file called test.text 
	@Test
	public void test1() {
		
	}
}
