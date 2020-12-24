/*
Write a program that asks the user for a floating-point number. The program then prints the user's input value.
Give a number:
3.14
You gave the number 3.14
 */
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This asks the user for a number and then saves the user input.
        System.out.println("Give a number:");
        Double value = Double.valueOf(scanner.nextLine());

        //This displays onto the screen the number given by the user.
        System.out.println("You gave the number " + value);

    }
}
