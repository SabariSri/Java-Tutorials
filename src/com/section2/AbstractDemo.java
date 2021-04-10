package com.section2;
import com.references.Cars_Abstract;

public class AbstractDemo extends Cars_Abstract{
	
	public AbstractDemo(int startSpeed) {
		super(startSpeed);
	}

	public void setPrivateSpeed() {
		super.setPrivateSpeed(10);
	}

	@Override
	public void abstractMethod(String arg1, int arg2) {
		System.out.println("This is the BMW engine start");		
		
	}	
}
