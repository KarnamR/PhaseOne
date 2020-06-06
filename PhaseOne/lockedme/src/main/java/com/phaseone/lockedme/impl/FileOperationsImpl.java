package com.phaseone.lockedme.impl;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.phaseone.lockedme.Message;
import com.phaseone.lockedme.interfaces.FileOperations;


public class FileOperationsImpl implements FileOperations {
	
	public String getFileName() {
		Message.printMessage("Please Enter File Name : ");
		Scanner inp = new Scanner(System.in);		
		String fileName = inp.nextLine();	
		return fileName;
	}

	public void addFile(String filename) {

 		File file = new File(filename);

		try {
			if (file.createNewFile()) {
				Message.printMessage(file.getAbsolutePath() + " File Created");
			} else
				Message.printMessage("File " + file.getAbsolutePath() + " already exists");
		} catch (IOException e) {
			Message.printMessage(e.getMessage());
		}
	}
	
	public void deleteFile(String fileName) {
		try {
			File f = new File(fileName); 
			if (f.delete())
			{
				Message.printMessage(f.getName() + " deleted"); 
			} else {
				Message.printMessage("File not found in the location "+f.getAbsolutePath());
			}
		} catch (Exception e) {
			Message.printMessage(e.getMessage());
		}
	}
	
	public void searchFile(String fileName) {
		File f = new File(fileName);
		File dir = new File(System.getProperty("user.dir"));
		String[] files = dir.list();
		boolean flag = false;

		if (files.length == 0) {
			Message.printMessage("The directory is empty");
		} else {
			for (String aFile : files) {				
				if (aFile.equals(fileName)) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			Message.printMessage("File " + fileName + " found in directory " + dir.getAbsolutePath());
		} else {
			Message.printMessage("File " + fileName + " not found in directory " + dir.getAbsolutePath());
			
		}
	}

	public void retrieveFiles() {
		Message.printMessage("Files :");
		File dir = new File(System.getProperty("user.dir"));
		String[] files = dir.list();
		Arrays.sort(files);
		if (files.length == 0) {
			Message.printMessage("Directory is empty");
		 } else {
			for (String aFile : files) {
				Message.printMessage(aFile);
			}
		}
		Message.printMessage("All Files Displayed");
	}

}
