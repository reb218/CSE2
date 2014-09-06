//Ryan Baitch
//September 3, 2014
//Lab02-Cyclometer Java Program

//define a class
public class Cyclometer{
//Add main method
public static void main(String[]args){

int secsTrip1=480;  //stores elapsed time in seconds of trip 1
int secsTrip2=3220; //stores elapsed time in seconds of trip 2
int countsTrip1=1561; //records rotations of trip 1
int countsTrip2=9037; //records rotations of trip 2
double wheelDiameter=27.0, //double indicates number is rounded to one decimal place
PI=3.14159, //value of pi
feetPerMile=5280, //stating amount of feet in one mile
inchesPerFoot=12, //stating amount of inches in one foot
secsPerMinute=60; //stating amount of seconds in one minute
double distanceTrip1, distanceTrip2, totalDistance;  
System.out.println("Trip 1 took "+secsTrip1/secsPerMinute+" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+secsTrip2/secsPerMinute+" minutes and had "+countsTrip2+" counts.");
distanceTrip1=countsTrip1*wheelDiameter*PI; 
//gives distance of trip 1 in inches
//(for each count, a rotaion of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
//print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");
    }    
}