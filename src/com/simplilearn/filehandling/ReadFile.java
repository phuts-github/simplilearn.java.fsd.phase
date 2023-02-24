package com.simplilearn.filehandling;

import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String filePath = "/home/phuthinhotmail/eclipse-workspace/simplilearn-java-fsd-phase1/";
		String filePath = "C:/Users/phuth/git/simplilearn.java.fsd.phase1/";


		Scanner fileReader = new Scanner (filePath + "testFile.txt");
		
		try {
			while (fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println("file data " + fileData);
				
			}

		} catch (IllegalStateException ie) {
			// TODO Auto-generated catch block
			System.out.println("Error occured while reading the file");
			ie.printStackTrace();
		}
		finally {
			fileReader.close();
		}
		
		
	}

}
