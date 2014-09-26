//Ryan Baitch
//CSE2-Brian Chen
//Lab05-RandomGames Program
//September 24, 2014

//Import the scanner
import java.util.Scanner;

//Define the class
public class RandomGames{
    
    //Add main method 
public static void main(String[]args){
    String option;
    Scanner myScanner;
    myScanner=new Scanner(System.in); //Scanner accepts user input
    System.out.println("Enter R or r for Roulette, C or c for Craps, P or p for Pick a Card: ");
    option=myScanner.next();
    switch (option){
        case "R":
            int number=(int)((Math.random()*37));
            System.out.println("Roulette: "+number);
            break;
        case "r":
            number=(int)((Math.random()*37));
            System.out.println("Roulette: "+number);
            break;
        case "C":
            int card=(int)(Math.random()*6)+1;
            int card2=(int)(Math.random()*6)+1;
            System.out.println("Craps: "+card+"+"+card2+"="+(card+card2));
            break;
        case "c":
            card=(int)(Math.random()*6)+1;
            card2=(int)(Math.random()*6)+1;
            System.out.println("Craps: "+card+"+"+card2+"="+(card+card2));
            break;
        case "P":
            String suit;
            int val;
            int nSuit=(int)(Math.random()*4)+1;
            switch (nSuit){
                case 1:
                    suit="diamonds";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
                case 2:
                    suit="hearts";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
                case 3:
                    suit="clubs";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
                case 4:
                    suit="spades";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
            }
        case "p":
            nSuit=(int)(Math.random()*4)+1;
            switch (nSuit){
                case 1:
                    suit="diamonds";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
                case 2:
                    suit="hearts";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
                case 3:
                    suit="clubs";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
                    break;
                case 4:
                    suit="spades";
                    val=(int)(Math.random()*13)+1;
                    System.out.println(val+" of "+suit);
            }         
            
        }
    }
}