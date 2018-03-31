package com.jonathanwalsh;

import java.io.File;
import java.io.IOException;

public class ExperimentsWithFiles {
	
	public ExperimentsWithFiles(){
		
	}
	
	
	/**
	 * This method will open a file and then delete it
	 */
	public File OpenFile(String fn) {
		
		File f = new File(fn); 
		
		if( f.exists()) {
			// System.out.println("The file exists " + f.getPath());
		} else {
			try {
				f.createNewFile();
				// System.out.println("Created a file " + f.getAbsolutePath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
	}
	
	public void WriteToFile() {
		
	}
	
	
}
