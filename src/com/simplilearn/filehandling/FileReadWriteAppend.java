package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/home/phuthinhotmail/eclipse-workspace/simplilearn-java-fsd-phase1/";
		String fileName = "ReadWriteAppend.txt";
		String filePathAndName = filePath+fileName;
		File f1 = new File(filePathAndName);

		for (int i=0; i<3;) {
			
			if ( f1.exists() && (i == 0)) {
				System.out.println("File already exists.");
				f1.delete();
				System.out.println("File deleted.");
				i=1;
			}
			// if the file exists, read it
			if (f1.exists()) {
				//read
				Scanner fileReader = new Scanner (filePathAndName);
				try {
					while (fileReader.hasNextLine()) {
						String frec = fileReader.nextLine();
						System.out.println("File read record - " + frec);
					}

				} catch (IllegalStateException ie) {
					// TODO Auto-generated catch block
					System.out.println("Error occured while reading the file");
					ie.printStackTrace();
				} finally {
					fileReader.close();
				}
				System.out.println("File end of records reached");
				System.out.println("File size prior to appending - " );
				
				// Append to file
				try {
					FileWriter fwa = new FileWriter (filePathAndName, true);
					fwa.write("File appended with this line today.");
					fwa.close();
					System.out.println("File append  completed.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error appending to file - " + filePathAndName);
					e.printStackTrace();
				}
				
				// File Create, Read, Write, Append completed.
				// Terminate the for loop
				i=3;
			}
			else {
				System.out.println("File not found. trying to create file.");
				try {
					if (f1.createNewFile()) {
						System.out.println("File creation completed.");
						System.out.println("\tFile directory is - " + f1.getPath());
						System.out.println("\tFile name is - " + f1.getName());

						// control to stop deleting the file
						i = 2;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// new file just got created. Write first record
				
				try {
					FileWriter fw = new FileWriter (filePathAndName);
					fw.write("File was created today.");
					System.out.println("File write completed.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error writing to file - " + filePathAndName);
					e.printStackTrace();
				} 
				
			}
		
		}
	

	}



}
