/*
Implement a program that asks the user for the number of days. After that, the program prints the number of seconds
in the given number of days.

How many days would you like to convert to seconds?
3
259200

 */
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This asks the user for the number of days that will be converted into seconds, and saves the user input.
        System.out.println("How many days would you like to convert to seconds?");
        int value = Integer.valueOf(scanner.nextLine());

        //This calculates the number of seconds, in the number of days defined by the user.
        value = value * 24 * 60 * 60;

        //This displays onto the screen the number of seconds, in the number of days that was entered by the user.
        System.out.println(value);

    }
}
