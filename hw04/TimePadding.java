//Ryan Baitch
//CSE2=Brian Chen
//hw04-TimePadding Program
//September 21, 2014

//import the scanner
import java.util.Scanner;

//Define the class
public class TimePadding{
    //Add main method
    public static void main(String[]args){
        int seconds;//seconds is the integer that the user inputs
        Scanner myScanner;//Declare the scanner
        myScanner=new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");//Prompts user to enter the time in seconds
        seconds=myScanner.nextInt();
        double hours=seconds/3600;
        int hours2=(int)hours;
        double minutes=(seconds-(hours2*3600))/60;
        int minutes2=(int)minutes;
        double seconds2=((seconds-(hours2*3600)-(minutes2*60)));
        int seconds3=(int)seconds2;
        if (minutes2>=10||seconds3>=10){ //If the minutes/seconds are ten or more, show them normally
        System.out.println("The time is "+hours2+":"+minutes2+":"+seconds3+".");
        }
        else{ //If the minutes and/or seconds are less than ten, a zero must be in fromt of the amount of minutes/seconds
        System.out.println("The time is "+hours2+":0"+minutes2+":0"+seconds3+".");    
        }
    }
}