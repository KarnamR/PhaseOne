package com.phaseone.lockedme.impl;

import com.phaseone.lockedme.exception.LockedMeException;
import com.phaseone.lockedme.interfaces.InputValidations;

public class InputValidationsImpl implements InputValidations {

	public void secondchoicemenu(int i) throws LockedMeException {

		if(!(i>=1 && i<=4)) {
			throw new LockedMeException("Invalid Input : Thanks for visiting LockedMe");
			
		}
			
	}

	public void mainmenu(int i) throws LockedMeException {

		if(!(i>=1 && i<=3)) {
			throw new LockedMeException("Invalid Input : Thanks for visiting LockedMe");	
		}
			
	}
	

}
