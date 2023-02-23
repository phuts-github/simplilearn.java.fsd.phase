package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/home/phuthinhotmail/eclipse-workspace/simplilearn-java-fsd-phase1/";
		
		try {
			FileWriter fw = new FileWriter (filePath + "testFile.txt");
			fw.write("Practice and Practice. It's the only way to help yourself");
			fw.close();
			System.out.println("Content written to the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured while writing to the file");
			e.printStackTrace();
		}
		
		
	}

}
