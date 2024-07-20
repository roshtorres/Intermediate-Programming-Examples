package obj_class;

public class Car 
{
	//Attributes
	String make;
	String color;
	String type;
	int model; //year
	int displacement;
	double fuelBurnRate; //liter per hour
	double fuelCapacity;
	
	/*void calculateDistance()
	{
		double distance;
		
		distance = fuelCapacity*fuelBurnRate;
		System.out.println("The Distance is " + distance);
		System.out.println("The Distance for " + this.make + " is " + distance);
	}*/
	
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
