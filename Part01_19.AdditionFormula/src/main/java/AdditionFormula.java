/*
Create a program that can be used to add two integers together. In the beginning, the user is asked to give two
integers that are to be summed. The program then prints the formula that describes the addition of the numbers.

Example output:
Give the first number:
5
Give the second number:
4
5 + 4 = 9
 */
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //These tasks ask for two numbers from the user and saves the numbers entered by the user.
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf (scanner.nextLine());

        //This task adds together the two numbers entered by the user.
        System.out.println(first + " + " + second + " = " + (first + second));

    }
}
