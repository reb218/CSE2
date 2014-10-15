//Ryan Baitch
//CSE2-Brian Chen
//HW06-Getting Loopy Root Program
//October 11, 2014

//Write a Java program that forces the user to enter a double that is greater than 0, uses the above algorithm to compute the square root of the number, and then prints it out.

//Import the scanner
import java.util.Scanner;

//Define the class
public class Root{
    //Add main method
    public static void main(String[]args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.println("Enter a double greater than 0: ");
        if (myScanner.hasNextDouble()){
            double x = myScanner.nextDouble();
            double low = 0;
            double high = 1+x;
            double middle = (high+low)/2;
            
            while ((high-x) > (0.0000001*(1+x))){
                while((x-low) < (0.0000001*(1+x))){
                    if ((middle*middle)>x){
                    high = middle;
                    middle = (high+low)/2;
                }
                else{
                    low = middle;
                    middle = (high+low)/2;
                }
                }
            }
            System.out.println("The square root is "+middle);
        }
    }
}