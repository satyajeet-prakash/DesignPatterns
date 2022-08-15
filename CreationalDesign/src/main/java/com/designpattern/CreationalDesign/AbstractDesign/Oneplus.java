package com.designpattern.CreationalDesign.AbstractDesign;

public class Oneplus implements Device {
	
	String ram;
	String processor;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void getDetails() {
		System.out.println("Oneplus Mobile with RAM size of " + ram + " and processor of " + processor);
	}
	
	@Override
	public String toString() {
		return "Oneplus [ram=" + ram + ", processor=" + processor + "]";
	}
	
}
