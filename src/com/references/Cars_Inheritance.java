package com.references;

public class Cars_Inheritance {
	public Cars_Inheritance(int startSpeed) {
		speed = startSpeed;
	}
	
	int speed;
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing speed of cars");
	}
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing speed of cars");
	}

}
