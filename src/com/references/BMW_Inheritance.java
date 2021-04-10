package com.references;
public class BMW_Inheritance extends Cars_Inheritance {
	public BMW_Inheritance(int startSpeed2) {
		super(startSpeed2);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of BMW");
	}
	public void headUpDisplayNavigation() {
		System.out.println("Specific feature of BMW");
	}


}
