//Ryan Baitch
//CSE2-Brian Chen
//hw05-BoolaBoola Program
//September 27, 2014

//Write a program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result.
//Import the scanner
import java.util.Scanner;

//Define the class
public class BoolaBoola{
    //add main method
    public static void main(String[]args){
        boolean val1=Math.random()<.5;
        boolean val2=Math.random()>.5;
        boolean val3=Math.random()<.5;
        String answer;
        
        Scanner myScanner;//Declare the scanner name
        myScanner=new Scanner(System.in);//Scanner accepts input from the user
        System.out.println("Does "+val1+" || "+val2+" && "+val3+" have the value true (T/t) or false (F/f)? ");
        answer=myScanner.next();//answer is the letter that the user inputs
        switch (answer){
            case "T":
            case "t":
                if (val1||val2&&val3==true){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            case "F":
            case "f":
                if (val1||val2&&val3==false){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            default:{
                System.out.println("You did not enter T/t or F/f");
            }
        }
        
        myScanner=new Scanner(System.in);
        System.out.println("Does "+val1+" && "+val2+" && "+val3+" have the value true (T/t) or false (F/f)? ");
        answer=myScanner.next();
        switch (answer){
            case "T":
            case "t":
                if (val1&&val2&&val3==true){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            case "F":
            case "f":
                if (val1&&val2&&val3==false){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            default:{
                System.out.println("You did not enter T/t or F/f");
            }
        }
        
        myScanner=new Scanner(System.in);
        System.out.println("Does "+val1+" || "+val2+" || "+val3+" have the value true (T/t) or false (F/f)? ");
        answer=myScanner.next();
        switch (answer){
            case "T":
            case "t":
                if (val1||val2||val3==true){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            case "F":
            case "f":
                if (val1||val2||val3==false){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            default:{
                System.out.println("You did not enter T/t or F/f");
            }
        }    
    
    myScanner=new Scanner(System.in);
        System.out.println("Does "+val1+" && "+val2+" || "+val3+" have the value true (T/t) or false (F/f)? ");
        answer=myScanner.next();
        switch (answer){
            case "T":
            case "t":
                if (val1&&val2||val3==true){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            case "F":
            case "f":
                if (val1&&val2||val3==false){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Wrong; try again");
                }
                break;
            default:{
                System.out.println("You did not enter T/t or F/f");
            }
        }
    }
}