package sampleFile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class QuarterSales 
{
	static DecimalFormat df = new DecimalFormat("$##,###.00");
	static Scanner inputFile;
	static PrintWriter outputFile;
	static String rawData;
	static String[] specificRow = new String[6];
	static String fname, lname, name;
	static double q1 = 0.0, q2 = 0.0, q3 = 0.0, q4 = 0.0;
	static double agentSalesAve = 0.0, overallSales = 0.0, overallSalesAve = 0.0;
	static int agentCounter;
	
	public static void main(String[] args) throws FileNotFoundException
	{
		openFile();
		processFile();
		closeFile();
	}
	
	public static void openFile() throws FileNotFoundException
	{
		//Scanner input = new Scanner(System.in);
		
		//Scanner for File Handling
		inputFile = new Scanner(new FileReader("../Intermediate Programming - 5File Handling/src/sampleFile/SalesData.csv"));
		outputFile = new PrintWriter("../Intermediate Programming - 5File Handling/src/sampleFile/SalesReport.csv");
	}
	
	public static void closeFile()
	{
		inputFile.close();
		outputFile.close();
	}
	
	public static void processFile()
	{
		printHeader();
		
		while (inputFile.hasNext())
		{
			rawData = inputFile.nextLine();
			specificRow = rawData.split(",");
			
			fname = specificRow[0];
			lname = specificRow[1];
			
			name = lname.toUpperCase() + ", " + fname;
			
			q1 = Double.parseDouble(specificRow[2]);
			q2 = Double.parseDouble(specificRow[3]);
			q3 = Double.parseDouble(specificRow[4]);
			q4 = Double.parseDouble(specificRow[5]);
			
			agentSalesAve = (q1+q2+q3+q4)/4;
			overallSales+=agentSalesAve;
			
			System.out.println(name + "\t" + df.format(q1) + "\t" + df.format(q2) + "\t" + df.format(q3) + "\t" + df.format(q4) + "\t"  + df.format(agentSalesAve));
			
			agentCounter++;
		}
		overallSalesAve = overallSales/agentCounter;
		
		System.out.println();
		System.out.println("Overall Average Sales of Agent for the year: " + df.format(overallSalesAve));
	}
	
	public static void printHeader()
	{
		System.out.println("MoonLife");
		System.out.println("Agent's Quarterly Report");
		System.out.println();
		System.out.println("Agent Name\tQuarter1\tQuarter2\tQuarter3\tQuarter4\tAverage Sales");
	}
}
