//Ryan Baitch
//CSE2-Brian Chen
//HW10-FindDuplicates Program

import java.util.Scanner; //accept user input
public class FindDuplicates {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10]; //make an array named num
        String answer = "";
        do {
            System.out.print("Enter 10 ints- ");
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt(); //each integer the user enters becomes a variable in the array num[]
            }
            String out = "The array "; //the output will be the variable out, and depending upon the conditions of the array, the String out will display the appropriate output.
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                out += "has "; //the array has duplicates
            }
            else {
                out += "does not have "; //the array does not have duplicates
            }
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has "; //the array has exactly one duplicate
            }
            else {
                out += "does not have "; //the array does not have exactly one duplicate
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) { //lists the array num[] filled with values that the user entered
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
    public static boolean hasDups(int num[]) { //method called to determine whether or not the array num[] has duplicates
        int hasDup = 0;
        for (int j = 0; j < num.length; j++) {
            for (int i = 0; i < num.length; i++) { //compares each value in the array with each other value through a for loop
                if (num[i] == num[j]) {
                    hasDup++; //if it finds a duplicate, hasDup is incremented
                }
            }
        }
        if (hasDup > 0) {
            return true; //if there is a duplicate, the method returns true
        }
        else {
            return false; //if no duplicate, method returns false
        }
    }
    public static boolean exactlyOneDup(int num[]) {
        int dup = 0;
        for (int j = 0; j < num.length; j++) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] == num[j]) {
                    dup++;
                }
            }
        }
        if (dup == 1) { //if there is exactly one duplicate, the method returns true
            return true;
        }
        else {
            return false;
        }
    }
}