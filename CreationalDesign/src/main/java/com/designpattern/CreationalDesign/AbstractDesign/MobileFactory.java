package com.designpattern.CreationalDesign.AbstractDesign;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	Device getDevice(DeviceType type) 
	{
		switch (type) {
			case IPHONE:
				return new Iphone();
			case ONEPLUS:
				return new Oneplus();
		}
		return null;
	}

}
