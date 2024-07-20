package javaPackage;
import java.text.*;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		Car Kotse = new Car("TOYOTA", "Gray", 2014, 2500, "CAT", 45, 20.5);
		Kotse.setType("SUV");
		Car Auto = new Car("HONDA", "Red", 2009, 1300, "SEDAN", 30, 10.5);
		
		Kotse.display();
		System.out.println("The travel distance for " + Kotse.make + " is " + df.format(Kotse.calculateDistance1()));
		System.out.println("For " + Kotse.make + " to travel for 5.25 hours, it takes " + df.format(Kotse.fuelNeeded(5.25)) + " Liters of gas");
		
		System.out.println();
		
		Auto.display();
		System.out.println("The travel distance for " + Auto.make + " is " + df.format(Auto.calculateDistance1()));
		System.out.println("For " + Auto.make + " to travel for 10.5 hours, it takes " + df.format(Auto.fuelNeeded(10.5)) + " Liters of gas");

	}

}
