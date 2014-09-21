//Ryan Baitch
//CSE2- Brian Chen
//hw04-IncomeTax Program
//September 20, 2014

import java.util.Scanner; //Import the Scanner to accept input from the user
public class IncomeTax{
    public static void main(String[]args){
        Scanner myScanner;
        int income; //Income in thousands of dollars that the user inputs
        double incomeTax1=0.05;
        double incomeTax2=0.07;
        double incomeTax3=0.12;
        double incomeTax4=0.14;
        myScanner=new Scanner(System.in);
        System.out.println("Enter a positive int giving the number of thousands: ");
        if (myScanner.hasNextInt()){
            income=myScanner.nextInt();
            if (income>0){
               if (income<20){
                   System.out.println("The tax rate on $"+income*1000+" is 5.0%, and the tax is $"+(income*1000)*incomeTax1);
               }
               else if ((income>=20)&&(income<40)) {
                   System.out.println("The tax rate on $"+income*1000+" is 7.0%, and the tax is $"+(income*1000)*incomeTax2);
               }
               else if ((income>=40)&&(income<78)){
                   System.out.println("The tax rate on $"+income*1000+" is 12.0%, and the tax is $"+(income*1000)*incomeTax3);
               }
               else if ((income>=78)){
                   System.out.println("The tax rate on $"+income*1000+" is 14.0%, and the tax is $"+(income*1000)*incomeTax4);
               }
                   
            }
            else{
                System.out.println("You did not enter a positive int");
            }
        }
        else{
        System.out.println("You did not enter an int");
        }
    }
}