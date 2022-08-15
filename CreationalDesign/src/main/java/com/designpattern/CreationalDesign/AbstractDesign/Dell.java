package com.designpattern.CreationalDesign.AbstractDesign;

public class Dell implements Device {
	
	String ram;
	String processor;
	String memory;

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
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public void getDetails() {
		System.out.println("Dell laptop with RAM size: " + ram + " ,processor: " + processor + " and Memeory: "+memory);
	}
	@Override
	public String toString() {
		return "Dell [ram=" + ram + ", processor=" + processor + ", memory=" + memory + "]";
	}
	
}
