//Ryan Baitch
//CSE2-Brian Chen
//Homework 2: Bicycle
//September 10, 2014

import java.util.Scanner; //import the scanner

//define the class
public class Bicycle{
//add the main method
    public static void main(String[]args) {
        Scanner myScanner;
        myScanner=new Scanner(System.in); //Scanner allows program to accept input from the user
        System.out.print(
            "Enter the number of counts on the Cyclometer (an integer>0): ");
            //User enters number of counts recorded during sample run
        int nCounts=myScanner.nextInt();
        System.out.print(
            "Enter the number of seconds during which the counts on the Cyclometer occured (an integer>0): ");
            //User enters number of seconds during sample run
        int nSeconds=myScanner.nextInt();
        double nMinutes=nSeconds/60;
        double nHours=nMinutes/60;
        int dWheel=27; //diameter of wheels of bicycle in inches
        double pi=3.14159265;  //The value of pi
        double nCirc=dWheel*pi;  //The curcumfrence of the wheel=diameter of wheel*pi
        double dTraveled=(nCirc*nCounts)/63360; //The distace traveled during the sample run in miles
        int dTraveled2= (int)(dTraveled*100);
        double dTraveled3=(double)(dTraveled2/100.0);
        double avgSpeed=dTraveled/nHours;
        int avgSpeed2=(int) (avgSpeed*100);
        double avgSpeed3=(double)(avgSpeed2/100.0);
        System.out.println("The distance traveled was "+dTraveled3+ " miles and took "+nMinutes+ " minutes.");
        System.out.println("The average speed was "+avgSpeed3+" mph.");
    }
}