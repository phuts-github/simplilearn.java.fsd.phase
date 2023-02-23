package com.simplilearn.filehandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/home/phuthinhotmail/eclipse-workspace/simplilearn-java-fsd-phase1/";
		File f1 = new File (filePath + "testFile.txt");
		
		if (f1.exists()) {
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getName());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.length());
		}
		else {
			System.out.println("f1 does not exists");
		}

	}

}
