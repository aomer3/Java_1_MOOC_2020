/*
Create a program that multiplies the values stored in two integer variables.

For instance, if the entered numbers are 2 and 8, the program should print the following:
Give the first number:
2
Give the second number:
8
2 * 8 = 16
 */
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //These tasks incstruct the user to enter in two numbers and then saves the two user inputs.
        System.out.println("Give the first number:");
        int first = Integer.valueOf (scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf (scanner.nextLine());

        //This task multiplies the two numberes entered by the user and dispalys the product onto the screen.
        System.out.println(first + " * " + second + " = " + (first * second));

    }
}
