package com.phaseone.lockedme;

import java.io.IOException;
import java.util.Scanner;

public class Message {

	public static int welcomeMessage() throws IOException {
		printMessage("LockedMe.com");
		printMessage("Developer : LockedMe");
		printMessage("Locked Me Features");
		printMessage("1: LockedMe Files");
		printMessage("2: Add/Delete/Search a file");
		printMessage("3: Quit LockedMe");
		printMessage("Option :");
	
		Scanner read = new Scanner(System.in);
        int option = read.nextInt();		
		return option;
	}
	
	public static void printMessage(String m) {
		System.out.println(m);
	}
}
