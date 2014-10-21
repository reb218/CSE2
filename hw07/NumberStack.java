//Ryan Baitch
//CSE2-Brian Chen
//hw06- NumberStack program
//October 18, 2014

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {

        int number; //user input
        int i; //current number in cycle
        int columns; //number of columns
        int rows; //number of rows
        int spaces; //padding
        int dashes; //number of dashes after each i

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9- ");

        if (myScanner.hasNextInt()) {
            number = myScanner.nextInt();

            System.out.println("Using for loops:");
            for (i = 1; i <= number; i++) { //cycle through each individual number
                for (rows = 1; rows <= i; rows++) {
                    for (spaces = number - i; spaces >= 0; spaces--) {
                        System.out.print(" ");
                    }
                    for (columns = 1; columns <= i * 2 - 1; columns++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                for (spaces = number - i; spaces >= 0; spaces--) {
                    System.out.print(" ");
                }
                for (dashes = 1; dashes <= i * 2 - 1; dashes++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            System.out.println("Using while loops: ");
            i = 1;
            while (i <= number) {
                rows = 1;
                while (rows <= i) {
                    rows++;
                    spaces = number - i;
                    while (spaces >= 0) {
                        spaces--;
                        System.out.print(" ");
                    }
                    columns = 1;
                    while (columns <= i * 2 - 1) {
                        columns++;
                        System.out.print(i);
                    }
                    System.out.println();
                }
                spaces = number - i;
                while (spaces >= 0) {
                    spaces--;
                    System.out.print(" ");
                }
                dashes = 1;
                while (dashes <= i * 2 - 1) {
                    dashes++;
                    System.out.print("-");
                }
                System.out.println();
                i++;
            }

            System.out.println("Using do-while loops:");
            i = 1;
            do {
                rows = 1;
                do {
                    rows++;
                    spaces = number - i;
                    do {
                        spaces--;
                        System.out.print(" ");
                    } while (spaces >= 0);
                    columns = 1;
                    do {
                        columns++;
                        System.out.print(i);
                    } while (columns <= i * 2 - 1);
                    System.out.println();
                } while (rows <= i);
                spaces = number - i;
                do {
                    spaces--;
                    System.out.print(" ");
                } while (spaces >= 0);
                dashes = 1;
                do {
                    dashes++;
                    System.out.print("-");
                } while (dashes <= i * 2 - 1);
                System.out.println();
                i++;
            } while (i <= number);
        }
    }
}