//Ryan Baitch
//CSE2-Brian Chen
//Lab 03-BigMac
//September 10, 2014
//This program computes the total cost of buying a sum of Big Macs.
import java.util.Scanner;  //import the scanner
//Define the class
public class BigMac {
    //Add Main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //telling java to make space in memory for the Scanner
        System.out.print(
            "Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as "+"a double (in the form of xx.xx): " );
        double bigMac$=myScanner.nextDouble();
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        taxRate/=100; //user enters percent, but i want
         //proportion
        double cost$;
        int dollars, //whole dollar amount of cost
                dimes, pennies;  //for storing digits
                //to the right of the decimal point
                //for the cost$
        cost$=nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int) cost$;
        //get dimes amount, e.g.,
        //(int)(6.73*10) % 10 -> 67 % 10 -> 7
        //after the division: 583%100 -> 83, 27%5 -> 2
        dimes= (int)(cost$*10)%10;
        pennies= (int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+ " BigMacs, at $" +bigMac$+ " per BigMac, with a " +"sales tax of "+(int)(taxRate*100)+ "%, is $"+dollars+'.'+dimes+pennies);
    }
}
