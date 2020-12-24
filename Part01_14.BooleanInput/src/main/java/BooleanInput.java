/*
Write a program that asks the user for a boolean value. The program should then print the value provided by the user.
Write something:
santa does not exist
True or false? false

Note: Boolean variables can either have the value true or false. When converting a string to a boolean, the string
must be "true" if we want the boolean value to be true. The case is insensitive here: both "true" and "TRue" turn
into the boolean value of true. All other strings turn into the boolean false.
 */
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This asks the user to write out a word or statement and then saves the user input.
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());

        //This displays a message to the screen. 
        System.out.println("True or false? " + value);

    }
}
