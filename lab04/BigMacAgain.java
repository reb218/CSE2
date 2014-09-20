//Ryan Baitch
//CSE2-Brian Chen
//lab04-BigMac (Again)
//September 17, 2014

//Import the scanner to accept input from the user
import java.util.Scanner;

//Define the classs
public class BigMacAgain{
    //Add main method
    public static void main(String[]args){
        double costBigMacs;
        double costFries=2.15;
        Scanner myScanner;  //Declare the scanner
        myScanner=new Scanner(System.in);
        System.out.println("Enter the number of BigMacs: ");//promts user to enter the number of BigMacs
        if (myScanner.hasNextInt()){
            int nBigMacs=myScanner.nextInt(); //the variable is the amount of BigMacs that the user inputs
            costBigMacs=nBigMacs*2.22;
        System.out.println("You ordered "+nBigMacs+" BigMacs for a cost of "+nBigMacs+"*2.22= $"+costBigMacs);
        }
        else{
            System.out.println("You did not enter an int");
            return; //leaves the program; ie the program terminates
        }
        
        System.out.print("Do you want an order of fries (Y/y/N/n)? ");
        myScanner=new Scanner(System.in);
        String answer=myScanner.next();
        if (answer.equals("Y")){
        System.out.println("You ordered fries at a cost of $2.15");
        System.out.println("The total cost of the meal is "+(costBigMacs+costFries));
        }
        if (answer.equals("y")){
        System.out.println("You ordered fries at a cost of $2.15");
        System.out.println("The total cost of the meal is "+(costBigMacs+costFries));
        }  
        if (answer.equals(("N"))){
        System.out.println("The total cost of the meal is "+costBigMacs);
        }
         if (answer.equals(("n"))){
        System.out.println("The total cost of the meal is "+costBigMacs);
        }
        
    }
}


