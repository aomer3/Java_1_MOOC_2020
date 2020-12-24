/*
Implement a program which calculates the factorial of a number given by the user.

Sample output:
Give a number: 3
Factorial: 6
*/
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter a number.
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        //This task calculates the factorial of the number entered by the user.
        for(int i=factorial; i <= input; i++) {
            factorial *= i;
        }

        //This task displays the factorial on the screen.
        System.out.println("Factorial: " + factorial);


    }
}
 