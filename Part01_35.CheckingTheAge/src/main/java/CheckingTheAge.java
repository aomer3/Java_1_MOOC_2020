/*
Write a program that prompts the user to input their age and checks whether or not it is possible (at least 0 and at
most 120). Only use a single if-command in your program.

How old are you? 10
OK

How old are you? -3
Impossible!
 */
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter in their age, and saves the user input.
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        //This task determines if the age is valid, then displays a message onto the screen. 
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
