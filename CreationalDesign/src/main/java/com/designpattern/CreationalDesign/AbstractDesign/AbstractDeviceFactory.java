package com.designpattern.CreationalDesign.AbstractDesign;

public abstract class AbstractDeviceFactory {
	
	abstract Device getDevice(DeviceType type);
}
