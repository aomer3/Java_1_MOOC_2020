/*
Write a program that asks the user for numbers. If the number is negative, the program prints for user "Unsuitable
number" and asks the user for a new number. If the number is zero, the program exits the loop. If the number is
positive, the program prints the number to the power of two.

Output:
Give a number:
5
25

Output:
Give a number:
-3
Unsuitable number

OUtput:
Give a number:
0
 */
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter a number.
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            //This task asks the user to re-enter a number until the user enters a positive number.
            if(input < 0){
                System.out.println("Unsuitable number");
                continue;
            }

            //This task ends the program if the user enters 0.
            if(input == 0){
                break;
            }

            //This task displays the square of the number entered by the user.
            System.out.println(input*input);
        }

    }
}