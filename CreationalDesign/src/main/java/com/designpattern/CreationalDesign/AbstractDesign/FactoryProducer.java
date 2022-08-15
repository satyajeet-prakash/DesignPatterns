package com.designpattern.CreationalDesign.AbstractDesign;

public class FactoryProducer {
	public static AbstractDeviceFactory getFactory(FactoryType ftype) 
	{
		switch(ftype) {
			case LAPTOPFACTORY:
				return new LaptopFactory();
			case MOBILEFACTORY:
				return new MobileFactory();
		}
		return null;
		
	}
}
