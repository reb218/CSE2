//Ryan Baitch
//CSE2-Brian Chen
//hw04-Month Program
//September 19.2014

import java.util.Scanner; //import the Scanner to accept user input

//Define the class
public class Month{
    //Add main method
    public static void main(String[]args){
        int month; //months are entered as integers between 1 and 12
        int year;
        boolean leapYear;
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.println("Enter an int giving the number of the month(1-12): "); //Ask the user to input the number corresponding to the month
        if (myScanner.hasNextInt()){
            month=myScanner.nextInt();//Variable month corresponds to the integer the user inputs
            if (month>=1 && month<=12){
                if ((month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12)){ //Includes all months with 31 days
                    System.out.println("The month has 31 days");
                }
                if ((month==4) || (month==6) || (month==9) || (month==11)){ //Includes all months with 30 days
                
                    System.out.println("The month has 30 days");
                }
                if (month==2){
                    System.out.println("Enter an int giving the year: "); //If the user enters Febuary, the days of the month may vary depending on whether or not it is a leap year
                    myScanner=new Scanner(System.in);
                    year=myScanner.nextInt();
                    //check if the year is a leap year
                    leapYear=
                    ((year/4==0 && year/100!=0) || (year/400==0));  
                    if (leapYear=true){
                        System.out.println("The month has 29 days");//If the year is a leap year, Febuary has 29 days
                    }
                    else{
                        System.out.println("The month has 28 days");//If the year is not a leap year, Febuary has 28 days
                    }
                    
                    
                }
            }
            
        }
    }
}

