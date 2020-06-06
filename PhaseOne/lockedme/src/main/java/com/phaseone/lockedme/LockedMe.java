package com.phaseone.lockedme;

import java.io.IOException;
import java.util.Scanner;

import com.phaseone.lockedme.exception.LockedMeException;
import com.phaseone.lockedme.impl.FileOperationsImpl;
import com.phaseone.lockedme.impl.InputValidationsImpl;

public class LockedMe 
{
//	static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	
	

	public static void main(String[] args) throws IOException, LockedMeException {

		FileOperationsImpl foi = new FileOperationsImpl();
		InputValidationsImpl ivi = new InputValidationsImpl();
		
		while (true) {
			int msg = Message.welcomeMessage();
			ivi.mainmenu(msg);
			switch (msg) {
			case 1:
				Message.printMessage("Locked Me Files :");
				foi.retrieveFiles();
				break;
			case 2:	
				Message.printMessage("1: Add");
				Message.printMessage("2: Delete");
				Message.printMessage("3: Search");
				Message.printMessage("4: Main Menu");
				Message.printMessage("Option :");			
				Scanner in2 = new Scanner(System.in);
				int	option2 = in2.nextInt();
				ivi.secondchoicemenu(option2);
				
				switch (option2) {
				case 1:						
					foi.addFile(foi.getFileName());
					break;
				case 2:	
					foi.deleteFile( foi.getFileName());
					break;
				case 3:
					foi.searchFile(foi.getFileName());
					break;
				case 4:					
					break;
				}
				break;
				
			case 3:
				Message.printMessage("Thanks for visiting LockedMe");
				System.exit(0);
				break;		
			}			
		}
	}
}

