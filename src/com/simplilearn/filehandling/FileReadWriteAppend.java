package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteAppend {

	public static void main(String[] args) throws IOException {

//		String filePath = "/home/phuthinhotmail/eclipse-workspace/simplilearn-java-fsd-phase1/";
		String filePath = "C:/Users/phuth/git/simplilearn.java.fsd.phase1/";
		String fileName = "ReadWriteAppend.txt";
		String filePathAndName = filePath+fileName;
		File f1 = new File(filePathAndName);

		System.out.println("Working file is - " + f1);

		// records to be added to the file
		String [] arrayRecordsToAdd = new String [3];
		arrayRecordsToAdd[0] = "Added record one";
		arrayRecordsToAdd[1] = "Added record two";
		arrayRecordsToAdd[2] = "Added record three";

		// records to be appended to the file
		String [] arrayRecordsToAppend = new String [2];
		arrayRecordsToAppend[0] = "Appended record one";
		arrayRecordsToAppend[1] = "Appended record two";

		for (int i=0; i<3;) {
			
			if ( f1.exists() && (i == 0)) {
				System.out.println("File already exists");
				deleteFile(f1);
				i=1;
			}

			// if the file exists, process it.
			if (f1.exists()) {
				// call a method to print file contents before append.
				System.out.println();
				System.out.println("Calling file record print method before appending more records");
				printFileRecords (f1);

				// call a method append records on the array to the file
				System.out.println();
				System.out.println("Calling file record append method");
				appendRecordsToFile (f1,arrayRecordsToAppend);

				// call a method to print file contents after append.
				System.out.println();
				System.out.println("Calling file record print method after appending more records");
				printFileRecords (f1);

				i=3;
			}
			else {
				System.out.println();
				System.out.println("File not found. Creating file..");

				// calling a method to create a file
				System.out.println();
				createFile(f1);
				i = 2;

				// call a method to add records to the file
				System.out.println();
				System.out.println("Calling file record add method");
				addRecordToFile (f1,arrayRecordsToAdd);
			}
		}
	}

	private static void createFile(File f1) throws IOException {
		System.out.println("Creating file..");
		f1.createNewFile();
		System.out.println("File created");
	}

	private static void addRecordToFile (File f1, String[] arrayRecordsToAdd) throws IOException {

		FileWriter fw = new FileWriter (f1);

		try {
			System.out.println("\tStart of record add..");

			for (int i = 0; i < arrayRecordsToAdd.length; i++) {
				fw.write(arrayRecordsToAdd[i] + "\n");
				System.out.println("\t\t" + (i+1) + " record(s) added");
			}

			System.out.println("\tEnd of record add");

		} catch (IOException e) {
			System.out.println("Error writing to file - " + f1);
			e.printStackTrace();
		}
		finally {
			fw.close();
		}
	}

	private static void printFileRecords (File f1) {
		try {
			System.out.println("\t Start of file print..");
			Scanner fileReader = new Scanner (f1);

			while (fileReader.hasNextLine()) {
				String fData = fileReader.nextLine();
				System.out.println("\t\t " + fData);
			}
			System.out.println("\t End of file print");

		} catch (IllegalStateException ie) {
			System.out.println("Error reading the file");
			ie.printStackTrace();

		} catch (FileNotFoundException fnf) {
			System.out.println("File not found");
			fnf.printStackTrace();
		}
	}

	private static void deleteFile (File f1) {
		System.out.println("Deleting file..");
		f1.delete();
		System.out.println("\tFile deleted");
	}
	private static void appendRecordsToFile(File f1, String[] arrayRecordsToAppend) throws IOException {

		FileWriter fwa = new FileWriter (f1,true);

		try {
			System.out.println("\tStart of record append..");

			for (int i = 0; i < arrayRecordsToAppend.length; i++) {
				fwa.append(arrayRecordsToAppend[i] + "\n");
				System.out.println("\t\t" + (i+1) + " record(s) appended");
			}

			System.out.println("\tEnd of record append");

		} catch (IOException e) {
			System.out.println("Error writing to file - " + f1);
			e.printStackTrace();
		}
		finally {
			fwa.close();
		}
	}
}
