/*
Write a program that asks the user to write a string. When the user has provided a string (i.e., written some text and
pressed the enter key), the program should print the string that was provided by the user.
 */
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task instructs the user to enter a message and then saves the user input.
        System.out.println("Write a message:");
        String message = scanner.nextLine();

        //This tasks displays the user-created message onto the screen.
        System.out.println(message);

    }
}
