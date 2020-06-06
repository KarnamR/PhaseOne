package com.phaseone.lockedme.interfaces;

import com.phaseone.lockedme.exception.LockedMeException;

public interface InputValidations {
	
	void mainmenu(int i) throws LockedMeException;
	void secondchoicemenu(int i) throws LockedMeException;

}