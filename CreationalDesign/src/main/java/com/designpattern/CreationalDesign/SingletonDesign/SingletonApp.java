package com.designpattern.CreationalDesign.SingletonDesign;

public class SingletonApp {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();
		
		System.out.println(obj+ " \n" + obj1);
	}

}

class Singleton 
{
	static Singleton obj = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() 
	{
		return obj;
	}
}