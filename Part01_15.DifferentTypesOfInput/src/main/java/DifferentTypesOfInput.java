/*
Write a program that asks the user for a string, an integer, a floating-point number, and a boolean. The program
should then print the values given by the user.

Give a string:
bye-bye
Give an integer:
11
Give a double:
4.2
Give a boolean:
true
You gave the string bye-bye
You gave the integer 11
You gave the double 4.2
You gave the boolean true
 */
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //These tasks ask a user for input and save the user input.
        System.out.println("Give a string:");
        String inputStr = scan.nextLine();
        System.out.println("Give an integer:");
        Integer inputInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double inputDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean inputBool = Boolean.valueOf(scan.nextLine());

        //These tasks display the user-input onto the screen. 
        System.out.println("You gave the string " + inputStr);
        System.out.println("You gave the integer " + inputInt);
        System.out.println("You gave the double " + inputDouble);
        System.out.println("You gave the boolean " + inputBool);

    }
}
