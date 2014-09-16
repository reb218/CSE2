//Ryan Baitch
//CSE2-Brian Chen
//hw03-Root Program
//September 13, 2014

import java.util.Scanner;
//Import the Scanner

//define the class
public class Root{
//add main method
    public static void main(String[]args){
        Scanner myScanner; //Creates a new scanner for the program
        myScanner=new Scanner(System.in); //Scanner allows program to accept input from user
        System.out.print(
             "Enter any double and I guess its cube root: ");
            double x=myScanner.nextDouble(); //the variable x is what the user inputs
            double guess=x/3;
            guess=((guess*guess*guess+x)/(3*guess*guess));
            guess=((2*guess*guess*guess+x)/(3*guess*guess));
            guess=((2*guess*guess*guess+x)/(3*guess*guess));
            guess=((2*guess*guess*guess+x)/(3*guess*guess));
            guess=((2*guess*guess*guess+x)/(3*guess*guess));
            
            System.out.println("The cube root is "+guess);
    }
}