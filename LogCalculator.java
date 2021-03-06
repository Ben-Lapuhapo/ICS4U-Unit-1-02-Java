/**
* The Program calculates how many log a user can put in a truck
* 
* 
* 
* @author  Mr. Coxall
* @version 1.0
* @since   2020-01-01 
  */
import java.util.Scanner;


public class LogCalculator {
  public static void main(String args[]) {
    Scanner userInput = new Scanner(System.in);

    //Variables
    int truckTotalCapacity; // The total capacity the truck can hold
    int logWeight;
    double singleLogWeight; // Weight of a single log specified by user   
    double numberOfLogs;
    double logLength;

    truckTotalCapacity = 1100;
                logWeight = 20; // The weight of a log that is 1 m long is 20 kg

    System.out.print("Enter log size in metres (Choices: 0.25, 0.5, 1): ");
 
    // Obtains length of log from user
    logLength = userInput.nextDouble();

    //Calculates the weight of a single log
    singleLogWeight = logLength * logWeight;

    // Finds out how many of these logs can fit in the truck
    numberOfLogs = truckTotalCapacity/singleLogWeight;

    // Tells the user how many logs can fit in the truck
    System.out.print("The Truck Can Carry " + numberOfLogs + " Logs of " + logLength + "m.\n");
    
  }
}