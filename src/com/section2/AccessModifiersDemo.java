package com.section2;
import com.references.Cars_AccessModifiers;

import Referrence.*;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Cars_AccessModifiers c1 = new Cars_AccessModifiers(0);
		c1.increaseSpeed();
		c1.publicSpeed = 100;
		c1.setPrivateSpeed(10); // This method is public but variable inside it is a private
		//c1.speed = 10; >> This variable slips under "No access modifier"
		//c1.protectedSpeed = 100; >> This variable is Protected
		//c1.decreaseSpeed(); >> This method is Protected method
	}
	
}
