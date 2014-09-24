//Ryan Baitch
//CSE2=Brian Chen
//hw04-CourseNumber Program
//September 21, 2014

//import the scanner
import java.util.Scanner;

//Define the class
public class CourseNumber{
    //Add main method
    public static void main(String[]args){
        int course;
        Scanner myScanner;
        myScanner=new Scanner(System.in); //Scanner accepts user input
        System.out.println("Enter a 6-digit number giving the course semester: ");
        course=myScanner.nextInt(); //the variable "course" is whatever the user inputs
        double year=(course/100);
        int year2=(int)year;
        int courseNumber=(course%(year2*100));
        if (course>=186510 && course<=201440){
            if (courseNumber==10){
            System.out.println("The course was offered in the Spring semester of "+year2);
            }
            else if (courseNumber==20){
            System.out.println("The course was offered in the Summer 1 semester of "+year2);
            }
            else if (courseNumber==30){
            System.out.println("The course was offered in the Summer 2 semester of "+year2);
            }
            else if (courseNumber==40){
            System.out.println("The course was offered in the Fall semester of "+year2);
            }
            else{
            System.out.println(courseNumber+" is not a legitimate semester");
            }
        }
        else{
            System.out.println("the number was outside the range [186510,201440]");
        }
    }
}