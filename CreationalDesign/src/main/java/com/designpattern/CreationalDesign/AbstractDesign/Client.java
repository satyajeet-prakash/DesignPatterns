package com.designpattern.CreationalDesign.AbstractDesign;

public class Client {

	public static void main(String[] args) {
		Device device = FactoryProducer.getFactory(FactoryType.LAPTOPFACTORY).getDevice(DeviceType.DELL);
		
		device.setRam("6GB");
		device.setProcessor("Intel");
		
		System.out.print(device);
	}

}
