package main;
import math.*;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		//*Public
		
		//Class Instantiation:
		//ClassName identifier = new ClassName(); <--- Formula
		//Arithmetic calculation = new Arithmetic();
		
		//Two different ways to display certain output:
		//1.
		//Addition
		//System.out.println("The sum is " + calculation.addition(5,7));
		//2.
		//Subtraction
		//int diff = calculation.subtraction(10,1);
		//System.out.println("The difference is " + diff);
		
		//*Static
		int sum = Arithmetic.addition(6,7);
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + Arithmetic.subtraction(10,5));
		
		//*Final
		ConstantNumber cv = new ConstantNumber();
		
		//float pie = cv.PI;
		//System.out.println(pie);
		//cv.PI = 500;
		System.out.println(cv.PI);
	}

}
