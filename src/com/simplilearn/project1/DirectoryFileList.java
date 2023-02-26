package com.simplilearn.project1;

import java.io.File;
import java.util.List;

public class DirectoryFileList {

    public static void main(String[] args) {

        String folderPath = "C:/Users/phuth/git/simplilearn.java.fsd.phase1/.idea";

        File folder = new File(folderPath);

        File[] listOfFolderFiles = folder.listFiles();
        System.out.println(listOfFolderFiles.length);

        for (int i = 0; i < listOfFolderFiles.length; i++) {
            if (listOfFolderFiles[i].isFile()) {
                System.out.println("File Name : " + listOfFolderFiles[i].getName());
            } else if (listOfFolderFiles[i].isDirectory()) {
                System.out.println("Folder Name : " + listOfFolderFiles[i].getName());
            }
        }
    }





}
