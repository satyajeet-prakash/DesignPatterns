package com.designpattern.CreationalDesign.AbstractDesign;

public class LaptopFactory	 extends AbstractDeviceFactory {

	@Override
	Device getDevice(DeviceType type) 
	{
		switch (type) {
			case DELL: 
				return new Dell();
			case HP: 
				return new HP();

		}
		return null;
	}

}
