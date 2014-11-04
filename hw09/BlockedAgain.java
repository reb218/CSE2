//Ryan Baitch
//CSE2-Brian Chen
//hw09-BlockedAgain Program
//November 3, 2014

import java.util.Scanner;

public class BlockedAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 1;
        int i = 1;
        int rows = 1;
        int spaces = 1;
        int columns = 1;
        int dashes = 1;
        m = getInt (scan, m);
        allBlocks (m, i, rows, spaces, columns, dashes);
    }
    public static int getInt(Scanner scan, int m) {
        scan = new Scanner(System.in);
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        m = scan.nextInt();
        checkInt(scan, m);
        checkRange(m);
        return m;
    }
    public static int checkInt(Scanner scan, int m) {
        if (scan.hasNextInt()) {
            return m;
        }
        else {
            System.out.println("You did not enter an int, try again:");
            scan = new Scanner(System.in);
            getInt(scan, m);
        }
        return m;
    }
    public static int checkRange(int m) {
        if (m < 1) {
            System.out.println("You did not enter an int in the range [1,9], try again: ");
            Scanner scan = new Scanner(System.in);
            getInt(scan, m);
        }
        else if (m > 9) {
            System.out.println("You did not enter an int in the range [1,9], try again: ");
            Scanner scan = new Scanner(System.in);
            getInt(scan, m);
        }
        else {
            return m;
        }
        return m;
    }
    public static void allBlocks(int m, int i, int rows, int spaces, int columns, int dashes) {
        for (i = 1; i <= m; i++) {
            for (rows = 1; rows <= i; rows++) {
                for (spaces = m - i; spaces >= 0; spaces--) {
                    System.out.print(" ");
                }
                for (columns = 1; columns <= i * 2 - 1; columns++) {
                    System.out.print(i);
                }
                System.out.println();
            }
            for (spaces = m - i; spaces >= 0; spaces--) {
                System.out.print(" ");
            }
            for (dashes = 1; dashes <= i * 2 - 1; dashes++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}