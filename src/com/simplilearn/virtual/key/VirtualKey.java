package com.simplilearn.virtual.key;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKey {

    public static void main(String[] args) {
        File folder = new File(Constants.folderPath);
        File[] listOfFolderFiles = null;

        // loading initial file list. The list will be refreshed based on functions selected.
        listOfFolderFiles = retrieveFileList(folder,null);
        String selectedMainMenuOption = "";
        Scanner sc = new Scanner(System.in);

        while (!selectedMainMenuOption.equals(Constants.Q_QUIT_APPLICATION)) {

            printMainMenu();
            System.out.print("\nEnter your choice:\t");
            selectedMainMenuOption = sc.nextLine().toUpperCase();

            switch (selectedMainMenuOption) {
                case Constants.R_RETRIEVE_FILE_LIST -> {
                    listOfFolderFiles = retrieveFileList(folder, listOfFolderFiles);
                    printRetrievedFileList(listOfFolderFiles);
                }
                case Constants.F_FILE_HANDLING -> {
                    fileHandling(folder, listOfFolderFiles);
                }
                case Constants.Q_QUIT_APPLICATION -> {
                    closeApp();
                }
                default -> {
                    System.out.println("You have entered an invalid choice!\nTry again!\n");
                }
            }
        }
    }
    private static void closeApp() {
        System.out.println("\tClosing your application... \n\tThank you!");
    }
    private static File[] retrieveFileList(File folder, File[] listOfFolderFiles) {
        listOfFolderFiles = folder.listFiles();
        if (listOfFolderFiles != null) {
            int countOfFilesFound = listOfFolderFiles.length;
            if (countOfFilesFound > 1) {
                Arrays.stream(listOfFolderFiles).sorted();
            }

            System.out.println("\nFiles found int the folder is - " + countOfFilesFound + "\n");
            return listOfFolderFiles;

        } else {
            System.out.println("\nFolder has no files in it,\n\tFolder path - " + folder);
        }
        return null;
    }
    private static void printRetrievedFileList(File[] listOfFolderFiles) {

        int countOfFilesFound = listOfFolderFiles.length;

        System.out.println("\nFiles found int the folder is - " + countOfFilesFound + "\n");

        for (int i = 0; i < countOfFilesFound; i++) {
            if (listOfFolderFiles[i].isFile()) {
                System.out.println("\t" + (i+1) + "\tFile\t: " + listOfFolderFiles[i].getName());
            } else if (listOfFolderFiles[i].isDirectory()) {
                System.out.println("\t" + (i+1) + "\tFolder\t: " + listOfFolderFiles[i].getName());
            }
        }
    }
    private static void printMainMenu() {
        System.out.println("\n***********   Main Menu   ************\n");
        for (String mainMenu : Constants.arrayMainMenu) {
            System.out.println(mainMenu);
        }
    }
    private static void printFileHandlingMenu() {
        System.out.println("\n*******   File Handling Menu   *******\n");
        for (String fileHandlingMainMenu : Constants.arrayFileHandlingMainMenu) {
            System.out.println(fileHandlingMainMenu);
        }
    }
    private static void fileHandling(File folder, File[] listOfFolderFiles) {
        Scanner sc = new Scanner(System.in);
        String selectedFileMenuOption = "";

        while (!selectedFileMenuOption.equals(Constants.M_MAIN_MENU)) {

            printFileHandlingMenu();
            System.out.print("\nEnter your choice:\t");
            selectedFileMenuOption = sc.nextLine().toUpperCase();

            switch (selectedFileMenuOption) {
                case Constants.A_ADD_FILE -> {
                    System.out.println("Temp - add selected.\n");
                    if (addFile(folder)) {
                        listOfFolderFiles = retrieveFileList(folder, listOfFolderFiles);
                    }
                }
                case Constants.D_DELETE_FILE -> {
                    System.out.println("Temp - delete selected.\n");
                    if (deleteFile(folder)) {
                        listOfFolderFiles = retrieveFileList(folder, listOfFolderFiles);
                    }
                }
                case Constants.S_SEARCH_FILE -> {
                    System.out.println("Temp - search selected.\n");
                    searchFile(listOfFolderFiles);
                }
                case Constants.M_MAIN_MENU -> {
                }
                default -> {
                    System.out.println("You have entered an invalid choice!\nTry again!\n");
                }
            }
        }
    }
    private static boolean addFile( File folder) {
        System.out.println();
        System.out.print("Enter the file name to add: \t");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String inputFileName = sc.nextLine();

        File f1 = new File(folder + "/"+ inputFileName);

        if (f1.exists()) {
            System.out.println("\tFile '" + inputFileName + "' already exists.");
            return false;
        } else {
            try {
                f1.createNewFile();
                System.out.println("\tFile '" + inputFileName + "' created");
                return true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static boolean deleteFile(File folder) {
        System.out.println();
        System.out.print("Enter the file name to delete: \t");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String inputFileName = sc.nextLine();

        File f1 = new File(folder + "/"+ inputFileName);

        if (f1.exists()) {
            f1.delete();
            System.out.println("\tFile deleted");
            return true;
        } else {
            System.out.println("\tFile '" + inputFileName + "' not found");
            return false;
        }
    }
    private static void searchFile(File[] listOfFolderFiles) {

        int arrayFileListLength = listOfFolderFiles.length;
        System.out.println();
        System.out.print("Enter the file name to search: \t");
        System.out.println();

        if (arrayFileListLength > 0) {
            Scanner sc = new Scanner(System.in);
            String inputFileName = sc.nextLine();
            int i = 0;

            for (i = 0; i < arrayFileListLength; i++) {
                if (listOfFolderFiles[i].getName().equalsIgnoreCase(inputFileName)) {
                    break;
                }
            }
            if (i != arrayFileListLength) {
                System.out.println("File Name '" + inputFileName + "' was found");
            }else {
                System.out.println("File Name '" + inputFileName + "' was not found\n");
            }
        } else {
            System.out.println("There are no files to search from\n");
        }
    }
}
