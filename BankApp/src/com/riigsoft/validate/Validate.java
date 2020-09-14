package com.riigsoft.validate;

public class Validate {

	private boolean flag;
	public boolean validate(int pinNo) {
		switch(pinNo) {
		case 1111:
			flag=true;
			break;
		case 2222:
			flag=true;
			break;
			default:
				flag=false;
				break;
		}
		return flag;
	}
}
