/*
Write a program that works as follows:
Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!
 */
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks ths user a question and stores the user input.
        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();

        //This task asks the user another question and stores the second input.
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();

        //This task displays a message onto the screen.
        System.out.println("Thanks for sharing!");

    }
}
