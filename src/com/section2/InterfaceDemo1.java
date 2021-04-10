package com.section2;
import com.references.BMW_Interface;
import com.references.Cars_Interface;

public class InterfaceDemo1 implements Cars_Interface, BMW_Interface{

	@Override
	public void BMW_engineSpec(int cyl, boolean keyLess) {
		System.out.println("This is BMW spec Implementation");		
	}

	@Override
	public void carsModel(int year, String name) {
		System.out.println("This is Cars Implementation");	
		System.out.println("Manufactured year :" +year);
		System.out.println("Model name: " +name);
	}

}
