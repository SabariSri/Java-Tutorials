package com.references;

public class Cars_AccessModifiers {
	// No Modifier - accessible in the same package
	int speed;
	int speedLimit = 100 ;
	
	// Only in class
	@SuppressWarnings("unused")
	private int privateSpeed;
	
	// Anywhere in Java World with importing the package and class
	public int publicSpeed;
	
	// In same package and in sub classes
	protected int protectedSpeed;
	
	public void setPrivateSpeed(int pSpeed) {
	this.privateSpeed = pSpeed;
	}

	public Cars_AccessModifiers (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
		
	public void increaseSpeed() {
		if (speed < 100) {
			speed++;
		}
		System.out.println("Increasing Speed of Cars ");
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}
}
