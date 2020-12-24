/*
A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only
when it is also divisible by 400.

Write a program that reads a year from the user, and checks whether or not it is a leap year.

Give a year: 2012
The year is a leap year.

Give a year: 1800
The year is not a leap year.
 */
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter a year, then saves the user input.
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());

        //This task determines if the year entered is a leap year, then displays a message onto the screen.
        if ((year % 100 == 0) && (year % 400 == 0) ) {
            System.out.println("The year is a leap year.");
        } else if ((year % 100 == 0) && !(year % 400 == 0)) {
            System.out.println("This year is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}
