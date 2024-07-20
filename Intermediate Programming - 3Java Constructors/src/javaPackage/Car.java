package javaPackage;

public class Car 
{
	//Instance or Global Variable, 
	String make;
	String color;
	int model;
	int displacement;
	String type;
	double fuelCapacity;
	double fuelBurnRate;
	
	//Constructor
	Car(String name, String color, int model, int displacement, String type, double fuelCapacity, double fuelBurnRate) //Parameters, Local Variable
	{
		make = name;
		this.color = color;
		this.model = model;
		this.displacement = displacement;
		//this.type = type;
		setType(type);
		this.fuelCapacity = fuelCapacity;
		this.fuelBurnRate = fuelBurnRate;
	}
	
	//Getters
	String getType()
	{
		return type;//or return this.type;
	}
	//Setters
	void setType (String type)
	{
		if(type == "SUV" || type == "SEDAN" || type == "PICKUP")
		{
			this.type = type;
		}
		else
		{
			this.type = "Unknown Type";
		}
	}
	
	void display()
	{
		System.out.println(this.make);
		System.out.println(this.color);
		System.out.println(this.model);
		System.out.println(this.displacement);
		System.out.println(getType());
		System.out.println(this.fuelCapacity);
		System.out.println(this.fuelBurnRate);
	}
	
	double calculateDistance1()
	{
		double distance;
		
		distance = fuelCapacity * fuelBurnRate;
		System.out.println("The Distance is " + distance);
		return distance;
	}
	
	double fuelNeeded(double time)
	{
		return time * fuelBurnRate;
	}
	

}
