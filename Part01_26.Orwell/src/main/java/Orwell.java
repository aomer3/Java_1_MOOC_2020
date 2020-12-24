/*
Write a program that prompts the user for an integer and prints the string "Orwell" if the number is exactly 1984.

Give a number:
1983

Give a number:
1984
Orwell
 */
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This tasks asks the user to input a year and saves the user input.
        System.out.println("Give a number:");
        int value = Integer.valueOf(scan.nextLine());

        //This task determines if the year entered is 1984, and displays "Orwell" only if the year is 1984.
        if(value == 1984) {
            System.out.println("Orwell");
        }
    }
}
