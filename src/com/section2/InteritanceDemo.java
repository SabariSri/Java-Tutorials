package com.section2;
import com.references.BMW_Inheritance;
import com.references.Cars_Inheritance;

public class InteritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		Cars_Inheritance c1 = new Cars_Inheritance(speed);
		c1.increaseSpeed();
		BMW_Inheritance b1 = new BMW_Inheritance(speed);
		b1.increaseSpeed();
		b1.headUpDisplayNavigation();

	}

}
