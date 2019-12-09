package com.capg.corejava.methods;

public class car {
	String name;
	String colour;
	double price;


	public car(String name, String colour, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public car() //zero argument constructor 
	{

	}
	public car(String name) 
	{
			this.name = name;
			
	}
	public car(double price) 
	{
			this.price = price;
			
	}
	@Override
	public String toString() {
		return "car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
}

