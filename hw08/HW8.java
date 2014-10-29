//Ryan Baitch
//CSE2 - Brian Chen
//hw08-Driver Program
//October 26,2014

import java.util.Scanner;

public class HW8{
  public static void main(String []args){
	String input;
	int input2 = 0;
	String yYnN = " ";
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.println("Enter 'y', 'Y', 'n', or 'N'- ");
	yYnN=getInput2(scan, yYnN); //give up after 5 attempts
	if(yYnN != " "){
   	System.out.println("You entered '"+yYnN+"'");
	}
	System.out.println("Enter one of: 1,2,3,4,5,6,7,8,9");
	input2=getInput(scan, input2);
	System.out.println("You entered '"+input2+"'");
  }
  public static String getInput(Scanner scan, String input){
      scan = new Scanner(System.in);
      input = scan.next();
      return input;
  }
  public static String getInput2(Scanner scan, String yYnN){
  	  yYnN = scan.next();
  	  return yYnN;
  }
  public static int getInput(Scanner scan, int input2){
      input2 = scan.nextInt();
      return input2;
  }
}