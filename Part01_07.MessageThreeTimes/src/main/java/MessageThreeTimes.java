/*
Write a program that asks the user to write a string. When the user has given a string (that is, written some text and
pressed enter), the program must print the user's string three times.
 */
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This tasks asks the user to enter a message and saves the user input.
        System.out.println("Write a message:");
        String message = scanner.nextLine();

        //This task prints the user-created message, three times onto the screen.
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

    }
}
