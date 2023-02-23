package com.simplilearn.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/home/phuthinhotmail/eclipse-workspace/simplilearn-java-fsd-phase1/";
		File f1 = new File (filePath + "testFile.txt");

		try {
			if (f1.createNewFile()) {
				System.out.println("File " + f1.getName() + " is created.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
