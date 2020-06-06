package com.phaseone.lockedme.interfaces;

public interface FileOperations {

	void retrieveFiles();
	void addFile(String fn);
	void deleteFile(String fn);
	void searchFile(String fn);

}