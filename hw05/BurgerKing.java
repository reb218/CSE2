//Ryan Baitch
//CSE2-Brian Chen
//hw05-BurgerKing Program
//September 26, 2014
//Write a program that prompts the user to enter a choice of a burger, a soda, or fries. Then the program prompts the users for details of their choices.

//import the scanner
import java.util.Scanner;

//Define the class
public class BurgerKing{
    //Add main method
    public static void main(String[]args){
        String choice;
        String burgerChoice;
        String soda;
        String fries;
        Scanner myScanner;//declare the scanner
        myScanner=new Scanner(System.in);//Scanner accepts input from the user
        System.out.println("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
        choice=myScanner.next();
        switch (choice){
            case "B":
                System.out.println("Enter A or a for 'all the fixins,' C or c for cheese, N or n for none of the above: ");
                myScanner=new Scanner(System.in);
                burgerChoice=myScanner.next();
                switch (burgerChoice){
                    case "A":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "C":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":
                         System.out.println("You ordered a burger with cheese");
                         break;
                    case "N":
                        System.out.println("You ordered a burger");
                        break;
                    case "n":
                        System.out.println("You ordered a burger");
                        break;
                }
                break;
            case "b":
                System.out.println("Enter A or a for 'all the fixins,' C or c for cheese, N or n for none of the above: ");
                myScanner=new Scanner(System.in);
                burgerChoice=myScanner.next();
                switch (burgerChoice){
                    case "A":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case "C":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":
                         System.out.println("You ordered a burger with cheese");
                         break;
                    case "N":
                        System.out.println("You ordered a burger");
                        break;
                    case "n":
                        System.out.println("You ordered a burger");
                        break;
                }
                break;
            case "S":
                System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s) or Mountain Dew (M or m)? ");
                myScanner=new Scanner(System.in);
                soda=myScanner.next();
                switch (soda){
                    case "P":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                }
                break;
            case "s":
                System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s) or Mountain Dew (M or m)? ");
                myScanner=new Scanner(System.in);
                soda=myScanner.next();
                switch (soda){
                    case "P":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                }
                break;
            case "F":
                System.out.println("Do you want a large or small order of fries (L,l,S,s)? ");
                myScanner=new Scanner(System.in);
                fries=myScanner.next();
                switch (fries){
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "S":
                        System.out.println("You ordered small fries");
                        break;
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                }
                break;
            case "f":
                System.out.println("Do you want a large or small order of fries (L,l,S,s)? ");
                myScanner=new Scanner(System.in);
                fries=myScanner.next();
                switch (fries){
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "S":
                        System.out.println("You ordered small fries");
                        break;
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                }
                break;    
                
        }
    }
}