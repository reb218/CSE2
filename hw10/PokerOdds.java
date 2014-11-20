//Ryan Baitch
//CSE2-Brian Chen
//Hw10- PokerOdds Program

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
  public static void main(String[] arg) {
    showHands();
  }
  public static void showHands() {
    String clubVal = "";
    String diamondVal = "";
    String heartVal = "";
    String spadeVal = "";
    int i = 0;
    int j = 0;
    int hand[] = new int[5];
    String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int deck[] = new int[52];
    for (i = 0; i < deck.length; i++) {
      deck[i] = i;
    }
    for (j = 0; j < hand.length; j++) {
      hand[j] = (int)(Math.random() * 52);
      if (hand[j] < 13) {
        switch (hand[j] % 13) {
            case 0:
              clubVal += "A ";
              break;
            case 1:
              clubVal+= "K ";
              break;
            case 2:
              clubVal+="Q ";
              break;
            case 3:
              clubVal+="J ";
              break;
            case 4:
              clubVal+="10 ";
              break;
            case 5:
              clubVal+="9 ";
              break;
            case 6:
              clubVal+="8 ";
              break;
            case 7:
              clubVal+="7 ";
              break;
            case 8:
              clubVal+= "6 ";
              break;
            case 9:
              clubVal+="5 ";
              break;
            case 10:
              clubVal+="4 ";
              break;
            case 11:
              clubVal+="3 ";
              break;
            case 12:
              clubVal+="2 ";
              break;
        }
      }
      if ((hand[j] >= 13) && (hand[j] < 25)) {
        switch (hand[j] % 13) {
            case 0:
              diamondVal += "A ";
              break;
            case 1:
              diamondVal+= "K ";
              break;
            case 2:
              diamondVal+="Q ";
              break;
            case 3:
              diamondVal+="J ";
              break;
            case 4:
              diamondVal+="10 ";
              break;
            case 5:
              diamondVal+="9 ";
              break;
            case 6:
              diamondVal+="8 ";
              break;
            case 7:
              diamondVal += "7 ";
              break;
            case 8:
              diamondVal+= "6 ";
              break;
            case 9:
              diamondVal+="5 ";
              break;
            case 10:
              diamondVal+="4 ";
              break;
            case 11:
              diamondVal+="3 ";
              break;
            case 12:
              diamondVal+="2 ";
              break;
        }
      }
      if ((hand[j] >= 25) && (hand[j] < 39)) {
        switch (hand[j] % 13) {
            case 0:
              heartVal += "A ";
              break;
            case 1:
              heartVal+= "K ";
              break;
            case 2:
              heartVal+="Q ";
              break;
            case 3:
              heartVal+="J ";
              break;
            case 4:
              heartVal+="10 ";
              break;
            case 5:
              heartVal+="9 ";
              break;
            case 6:
              heartVal+="8 ";
              break;
            case 7:
              heartVal += "7 ";
              break;
            case 8:
              heartVal+= "6 ";
              break;
            case 9:
              heartVal+="5 ";
              break;
            case 10:
              heartVal+="4 ";
              break;
            case 11:
              heartVal+="3 ";
              break;
            case 12:
              heartVal+="2 ";
              break;
        }
      }
      if ((hand[j] >= 39) && (hand[j] < 52)) {
        switch (hand[j] % 13) {
            case 0:
              spadeVal += "A ";
              break;
            case 1:
              spadeVal+= "K ";
              break;
            case 2:
              spadeVal+="Q ";
              break;
            case 3:
              spadeVal+="J ";
              break;
            case 4:
              spadeVal+="10 ";
              break;
            case 5:
              spadeVal+="9 ";
              break;
            case 6:
              spadeVal+="8 ";
              break;
            case 7:
              spadeVal+="7 ";
              break;
            case 8:
              spadeVal+= "6 ";
              break;
            case 9:
              spadeVal+="5 ";
              break;
            case 10:
              spadeVal+="4 ";
              break;
            case 11:
              spadeVal+="3 ";
              break;
            case 12:
              spadeVal+="2 ";
              break;
          }
      }
    }
    String answer;
    System.out.println("Clubs:" + clubVal);
    System.out.println("Diamonds:" + diamondVal);
    System.out.println("Hearts:" + heartVal);
    System.out.println("Spades:" + spadeVal);
    Scanner scan = new Scanner(System.in);
    System.out.println("Go again? Press 'y' or 'Y', anything else to quit ");
    answer = scan.next();
    switch (answer){
      case "y":
        showHands();
        break;
      case "Y":
        showHands();
        break;
      default:
      return;
    }
  }
}
