/*
Write a program that prompts the user for their name with the message "What's your name?". When the user has written
their name, the program has to print "Hi " followed by the user's name.
 */
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter a name and then saves the user input.
        System.out.println("What's your name?");
        String message = scanner.nextLine();

        //This task displays to the screen "Hi" and then the user's name.
        System.out.println("Hi " + message);

    }
}
