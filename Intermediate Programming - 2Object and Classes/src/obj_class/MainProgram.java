package obj_class;
import java.text.*;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("#,###.00");
		//Two ways of Instantiation:
		Car Kotse = new Car(); // <-- 1
		/*Car Auto;
		Auto = new Car(); <-- 2 */
		Car Auto = new Car();
		
		Kotse.make = "TOYOTA";
		Kotse.color = "Gray";
		Kotse.model = 2014;
		Kotse.displacement = 2500;
		Kotse.type = "SUV";
		Kotse.fuelCapacity = 45;
		Kotse.fuelBurnRate = 20.5;
		
		Auto.make = "HONDA";
		Auto.color = "Red";
		Auto.model = 2009;
		Auto.displacement = 1300;
		Auto.type = "Sedan";
		Auto.fuelCapacity = 30;
		Auto.fuelBurnRate = 10.5;
		
		System.out.println(Kotse.make);
		System.out.println(Kotse.color);
		System.out.println(Kotse.model);
		System.out.println(Kotse.displacement);
		System.out.println(Kotse.type);
		System.out.println(Kotse.fuelCapacity);
		System.out.println(Kotse.fuelBurnRate);
		//Kotse.calculateDistance();
		System.out.println("The travel distance for " + Kotse.make + " is " + df.format(Kotse.calculateDistance1()));
		System.out.println("For " + Kotse.make + " to travel for 5.25 hours, it takes " + df.format(Kotse.fuelNeeded(5.25)) + " Liters of gas");
		
		System.out.println();
		System.out.println(Auto.make);
		System.out.println(Auto.color);
		System.out.println(Auto.model);
		System.out.println(Auto.displacement);
		System.out.println(Auto.type);
		System.out.println(Auto.fuelCapacity);
		System.out.println(Auto.fuelBurnRate);
		//Auto.calculateDistance();
		System.out.println("The travel distance for " + Auto.make + " is " + df.format(Auto.calculateDistance1()));
		System.out.println("For " + Auto.make + " to travel for 10.5 hours, it takes " + df.format(Auto.fuelNeeded(10.5)) + " Liters of gas");

	}

}
