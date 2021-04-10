package com.references;

public abstract class Cars_Abstract {
	int speed;
	int speedLimit = 100;
	@SuppressWarnings("unused")
	private int privateSpeed;
	public int publicSpeed;
	protected int protectedSpeed;
	
	public void setPrivateSpeed(int pSpeed) {
	this.privateSpeed = pSpeed;
	}
	public Cars_Abstract (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
	public abstract void abstractMethod(String arg1, int arg2);
}
