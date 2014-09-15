//Ryan Baitch
//CSE2-Brian Chen
//hw03-Four Digits Program
//September 13, 2014

import java.util.Scanner; //Import the Scanner

//define the class
public class FourDigits{
//Add main method
public static void main(String[]args){
    Scanner myScanner;
    myScanner=new Scanner(System.in);//Allows Scanner to take input from the user
    System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
    double digits=myScanner.nextDouble();
    int digits2=(int)(digits); 
    int digits5=(int) (digits*10000);
    int digits3=(digits2*10000);
    int digits4=(digits5-digits3);
    System.out.println("The four digits are "+digits4);
    }
}